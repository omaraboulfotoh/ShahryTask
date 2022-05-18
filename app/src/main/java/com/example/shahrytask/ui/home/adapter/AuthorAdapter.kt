package com.example.shahrytask.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.shahrytask.R
import com.example.shahrytask.databinding.ItemAutherBinding
import com.example.shahrytask.ui.home.adapter.viewholder.AuthorViewHolder
import com.shahrytask.network.model.responses.AuthorModel

class AuthorAdapter (
    private val onItemSelected: (AuthorModel) -> Unit
) : ListAdapter<AuthorModel, RecyclerView.ViewHolder>(ProductDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ItemAutherBinding = DataBindingUtil.inflate(
            layoutInflater, R.layout.item_auther, parent, false
        )
        return AuthorViewHolder(binding, onItemSelected)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        (holder as AuthorViewHolder).bind(item)
    }

    class ProductDiffCallback : DiffUtil.ItemCallback<AuthorModel>() {
        override fun areItemsTheSame(old: AuthorModel, newItem: AuthorModel) =
            old.id == newItem.id

        override fun areContentsTheSame(old: AuthorModel, newItem: AuthorModel) =
            old.id == newItem.id
    }
}