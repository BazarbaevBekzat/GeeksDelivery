package com.geeks.example.geeksdelivery.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<Binding:ViewBinding>:Fragment() {
    private var _binding:Binding? = null
    protected val binding get() =_binding!!
    abstract fun getViewBinding():Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = getViewBinding()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        launchObserver()
        constListner()
    }
    protected fun init(){}
    protected fun launchObserver(){}
    protected fun constListner(){}
}