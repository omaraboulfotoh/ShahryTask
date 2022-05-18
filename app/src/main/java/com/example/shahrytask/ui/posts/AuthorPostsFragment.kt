package com.example.shahrytask.ui.posts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.addRepeatingJob
import androidx.lifecycle.lifecycleScope
import com.example.shahrytask.R
import com.example.shahrytask.databinding.FragmentAuthorPostsBinding
import com.example.shahrytask.ui.base.BaseFragment
import com.example.shahrytask.ui.posts.adapter.PostAdapter
import com.shahrytask.network.Result
import com.shahrytask.network.model.responses.AuthorModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class AuthorPostsFragment : BaseFragment() {

    private lateinit var binding: FragmentAuthorPostsBinding
    private val authorPostViewModel: AuthorPostViewModel by viewModels()


    private val adapter: PostAdapter by lazy {
        PostAdapter()
    }
    var page = 1

    private val author by lazy { requireArguments().getParcelable<AuthorModel>(KEY_AUTHOR) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.fragment_author_posts,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lifecycleOwner = this
        initView()
        getList(page)
    }

    private fun getList(page: Int) {
        if (networkHelper.isNetworkConnected()) {
            lifecycleScope.launch {
                addRepeatingJob(Lifecycle.State.RESUMED) {
                    authorPostViewModel.doPostsRequest(author!!.id, page).collect {
                        binding.swipeToRefresh.isRefreshing = false
                        when (it) {
                            is Result.Loading -> {
                            }
                            is Result.Success -> {
                                it.data?.let { data ->
                                    if (data.size > 0) {
                                        adapter.submitList(data)
                                    }
                                }
                            }
                            is Result.Error -> {
                                showSnackBar(getString(R.string.no_internet_connection))
                            }
                        }
                    }
                }
            }
        } else {
            showNoNetworkError()
        }
    }

    private fun initView() {
        binding.swipeToRefresh.setOnRefreshListener {
            binding.swipeToRefresh.isRefreshing = true
            page = 1
            adapter.submitList(null)
            getList(page)
        }

        binding.rvPosts.adapter = adapter
        binding.author = author
        binding.executePendingBindings()
        binding.viewToolbar.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }

    companion object {
        private const val KEY_AUTHOR = "KeyAuthor"
        fun getBundle(author: AuthorModel?): Bundle {
            val bundle = Bundle()
            author?.let {
                bundle.putParcelable(KEY_AUTHOR, it)
            }
            return bundle
        }
    }

}