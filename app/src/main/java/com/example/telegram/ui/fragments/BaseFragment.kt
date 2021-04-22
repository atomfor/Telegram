package com.example.telegram.ui.fragments

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.telegram.R

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


open class BaseFragment(val layout: Int) : Fragment() {

    private lateinit var mRootView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         mRootView = inflater.inflate(layout,container,false)
        return mRootView
    }

    override fun onStart() {
        super.onStart()
    }
}