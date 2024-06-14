package com.geeks.example.geeksdelivery.presentation.ui.fragment.menu

import com.geeks.example.geeksdelivery.databinding.FragmentMenuBinding
import com.geeks.example.geeksdelivery.presentation.base.BaseFragment
import com.geeks.example.geeksdelivery.presentation.ui.adapters.CategoryAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel


class MenuFragment: BaseFragment<FragmentMenuBinding>() {
    private val viewModel: MenuFragmentViewModel by viewModel()

    private val adapter: CategoryAdapter by lazy { CategoryAdapter() }

    override fun getViewBinding(): FragmentMenuBinding {
        return FragmentMenuBinding.inflate(layoutInflater)
    }

    init {
        binding.banners.adapter = adapter
        viewModel.getAllCategory()


        viewModel.categories.observe(viewLifecycleOwner) {
            adapter.submitList(it?.categories)


        }
    }
}