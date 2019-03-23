package com.example.seminar8

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MyFragment : Fragment() {

    // Singleton??
    companion object {
        private var instance : MyFragment? = null
        @Synchronized
        fun getInstance(title : String, content : String) : MyFragment {
            if (instance == null) {
                instance = MyFragment()
            }

            return instance!!
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_my, container, false)

        return view
    }
}