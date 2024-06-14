package com.geeks.example.geeksdelivery.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.geeks.example.geeksdelivery.data.remote.dto.CategoryDto
import com.geeks.example.geeksdelivery.databinding.ItemCategoryBinding

class CategoryAdapter:ListAdapter<CategoryDto, CategoryAdapter.CategoryViewHolder>(CategoryDiffutil()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            ItemCategoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    inner class CategoryViewHolder(private val binding: ItemCategoryBinding):
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(it: CategoryDto){
            binding.itemNameCategory.text = it.name
        }
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val model = getItem(position)
        holder.onBind(model)

    }

}
class CategoryDiffutil: DiffUtil.ItemCallback<CategoryDto>() {
    override fun areItemsTheSame(
        oldItem: CategoryDto,
        newItem: CategoryDto
    ): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(
        oldItem: CategoryDto,
        newItem: CategoryDto
    ): Boolean {
        return oldItem == newItem

    }

}