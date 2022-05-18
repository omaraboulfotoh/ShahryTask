package com.example.shahrytask.ui.home.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.shahrytask.databinding.ItemAutherBinding
import com.shahrytask.network.model.responses.AuthorModel

class AuthorViewHolder(
    private val binding: ItemAutherBinding,
    private val onItemSelected: (AuthorModel) -> Unit
) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: AuthorModel) {
        binding.author = item
        binding.root.setOnClickListener {
            onItemSelected.invoke(item)
        }
        binding.executePendingBindings()
    }
}