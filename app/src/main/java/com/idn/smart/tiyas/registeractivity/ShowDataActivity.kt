package com.idn.smart.tiyas.registeractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_show_data.*


class ShowDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_data)

        val intentTerima = intent
        val terimaUsername = intentTerima.getStringExtra("amplopUsername")
        val terimaEmail = intentTerima.getStringExtra("amplopEmail")
        val terimaPassword = intentTerima.getStringExtra("amplopPassword")
        val terimaConfirmPassowrd = intentTerima.getStringExtra("amplopConfirmPassword")

        tv_inputUsername.text = terimaUsername
        tv_inputEmail.text = terimaEmail
        tv_inputPassword.text = terimaPassword
        tv_inputresetpwd.text = terimaConfirmPassowrd
    }
}