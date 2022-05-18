package com.example.shahrytask.ui.posts.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.shahrytask.databinding.ItemPostBinding
import com.shahrytask.network.model.responses.PostModel

class PostViewHolder(
    private val binding: ItemPostBinding
) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: PostModel) {
        binding.post = item
        binding.executePendingBindings()
    }
}