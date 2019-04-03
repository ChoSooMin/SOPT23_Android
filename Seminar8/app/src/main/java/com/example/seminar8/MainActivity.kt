package com.example.seminar8

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Fragment 붙이기
        addFragment(MyFragment.getInstance("안녕", "안녕안녕"))

        // 다이얼로그
        setOnBtnClickListener()
    }

    private fun addFragment(fragment: Fragment) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fl_main_act_fragment, fragment)
        transaction.commit()
    }

    private fun setOnBtnClickListener() {
        // DialogFragment 사
        btn_main_act_show_first_dialog.setOnClickListener {
            val firstDialog : FirstDialogFragment = FirstDialogFragment()
            firstDialog.show(supportFragmentManager, "first dialog")
        }

        // AlertDialog 사용
        btn_main_act_show_second_dialog.setOnClickListener {
            val secondDialog : SecondDialog = SecondDialog(this)
            secondDialog.show()
        }
    }

    fun showMainActToastMessage() {
        toast("메인 액티비티 함수 호출")
    }
}
