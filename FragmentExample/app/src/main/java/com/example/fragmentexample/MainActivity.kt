package com.example.fragmentexample

import android.content.Context
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.*
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_my_page.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 하단 탭 설정
        initBottomTab()
    }

    // bottom Tab 설정
    private fun initBottomTab() {
        main_viewPager.adapter = MainBottomTabPagerAdapter(supportFragmentManager, 3)
//        main_viewPager.offscreenPageLimit = 3 // 이건 모징

        main_tabLayout.setupWithViewPager(main_viewPager) // viewPager와 tabLayout 연결

        val bottomTabLayout : View = (this.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater).inflate(R.layout.tab_view, null, false)

        main_tabLayout.getTabAt(0)!!.customView = bottomTabLayout.findViewById(R.id.btn_bottom_tab_home) as RelativeLayout
        main_tabLayout.getTabAt(1)!!.customView = bottomTabLayout.findViewById(R.id.btn_bottom_tab_category) as RelativeLayout
        main_tabLayout.getTabAt(2)!!.customView = bottomTabLayout.findViewById(R.id.btn_bottom_tab_myPage) as RelativeLayout
    }


    // PagerAdapter
    inner class MainBottomTabPagerAdapter(fm : FragmentManager, private val fragNum : Int) : FragmentStatePagerAdapter(fm) {


        override fun getItem(p0: Int): Fragment? {
            return when (p0) {
                0 -> HomeFragment()
                1 -> CategoryFragment()
                2 -> MyPageFragment()
                else -> null
            }
        }

        override fun getCount(): Int = fragNum
    }
}
