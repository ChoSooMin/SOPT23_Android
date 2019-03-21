package com.example.homework2

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    private val REQUEST_CODE_SIGN_UP = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_signUp.setOnClickListener {
            val inputId : String = et_id.text.toString()

            val intent = Intent(this, SignUpActivity::class.java)
            intent.putExtra("mainId", inputId)
            startActivityForResult(intent, REQUEST_CODE_SIGN_UP)
        }

        btn_signIn.setOnClickListener {
            toast("로그인")
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_CODE_SIGN_UP) {
            if (resultCode == Activity.RESULT_OK) {
                if (data != null) {
                    val signUpId = data.getStringExtra("signUpId")
                    et_id.setText(signUpId)
                }
            }
        }
    }
}
