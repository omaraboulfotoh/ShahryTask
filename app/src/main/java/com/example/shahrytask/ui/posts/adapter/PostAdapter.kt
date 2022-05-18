package com.example.shahrytask.ui.posts.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.shahrytask.R
import com.example.shahrytask.databinding.ItemPostBinding
import com.example.shahrytask.ui.posts.adapter.viewholder.PostViewHolder
import com.shahrytask.network.model.responses.PostModel

class PostAdapter(
) : ListAdapter<PostModel, RecyclerView.ViewHolder>(ProductDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ItemPostBinding = DataBindingUtil.inflate(
            layoutInflater, R.layout.item_post, parent, false
        )
        return PostViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        (holder as PostViewHolder).bind(item)
    }

    class ProductDiffCallback : DiffUtil.ItemCallback<PostModel>() {
        override fun areItemsTheSame(old: PostModel, newItem: PostModel) =
            old.id == newItem.id

        override fun areContentsTheSame(old: PostModel, newItem: PostModel) =
            old.id == newItem.id
    }
}