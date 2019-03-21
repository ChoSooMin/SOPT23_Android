package com.example.homework2

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val mainId = intent.getStringExtra("mainId")
        et_signUp_id.setText(mainId)

        btn_signUp_continue.setOnClickListener {
            val intent : Intent = Intent()
            intent.putExtra("signUpId", et_signUp_id.text.toString())
            setResult(Activity.RESULT_OK, intent)

            finish()
        }
    }
}
