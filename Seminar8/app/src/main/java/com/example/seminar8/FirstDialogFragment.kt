package com.example.seminar8

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.dialog_first.*

// DialogFragment 사용
class FirstDialogFragment : DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.dialog_first, container, false)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // 버튼 리스너
        btn_first_dialog_ok.setOnClickListener {
            if (activity is MainActivity) { // 현재 액티비티가 메인 액티비티라면
                // (activity as MainActivity)가 액티비티를 context로 바꾸는건가봉가,,?
                (activity as MainActivity).showMainActToastMessage() // MainActivity의 메서드 활용
            }

            dismiss()
        }
    }

}