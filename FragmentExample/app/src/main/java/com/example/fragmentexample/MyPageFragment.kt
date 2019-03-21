package com.example.fragmentexample

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_my_page.*

class MyPageFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val myPageFragmentView : View = inflater.inflate(R.layout.fragment_my_page, container, false)

//        addFragment(MyPageProfileFragment())
//        addFragment(MyPageMyShoppingFragment())

        return myPageFragmentView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        addFragment(MyPageProfileFragment())
        clickListener()

    }


    private fun clickListener() {
        fragment_my_page_profile_btn.setOnClickListener {
            fragment_my_page_profile_btn.setTextColor(Color.parseColor("#38c2f4"))
            fragment_my_page_my_shopping_btn.setTextColor(Color.parseColor("#7d7d7d"))
            replaceFragment(MyPageProfileFragment())
        }
        fragment_my_page_my_shopping_btn.setOnClickListener {
            fragment_my_page_profile_btn.setTextColor(Color.parseColor("#7d7d7d"))
            fragment_my_page_my_shopping_btn.setTextColor(Color.parseColor("#38c2f4"))
            replaceFragment(MyPageMyShoppingFragment())
        }
    }

    // 프래그먼트 붙이기
    private fun addFragment(fragment : Fragment) {
        val transaction : FragmentTransaction = childFragmentManager.beginTransaction() // fragment 내의 fragment 는 childFragmentManager가 관리...!?
        transaction.replace(R.id.fragment_my_page_fragment_block, fragment)
        transaction.commit()
    }

    // 버튼 누르면 프래그먼트 바뀌게 ...
    private fun replaceFragment(fragment : Fragment) {
        val transaction : FragmentTransaction = childFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_my_page_fragment_block, fragment)
        transaction.commit()
    }
}