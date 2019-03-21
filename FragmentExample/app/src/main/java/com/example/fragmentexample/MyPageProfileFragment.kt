package com.example.fragmentexample

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MyPageProfileFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val myPageProfileFragmentView : View = inflater.inflate(R.layout.fragment_my_page_profile, container, false)

        return myPageProfileFragmentView
    }
}