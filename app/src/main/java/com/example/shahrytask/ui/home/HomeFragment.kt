package com.example.shahrytask.ui.home

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
import com.example.shahrytask.databinding.FragmentHomeBinding
import com.example.shahrytask.ui.base.BaseFragment
import com.example.shahrytask.ui.home.adapter.AuthorAdapter
import com.shahrytask.network.Result
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeFragment : BaseFragment() {

    private lateinit var binding: FragmentHomeBinding
    private val homeViewModel: HomeViewModel by viewModels()


    private val adapter: AuthorAdapter by lazy {
        AuthorAdapter {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_home, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lifecycleOwner = this
        initView()
        getList()
    }

    private fun getList() {
        if (networkHelper.isNetworkConnected()) {
            lifecycleScope.launch {
                addRepeatingJob(Lifecycle.State.RESUMED) {
                    homeViewModel.doHomeRequest().collect {
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
            adapter.submitList(null)
            getList()
        }
        binding.rvHome.adapter = adapter
    }

}