package com.idn.smart.tiyas.registeractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_show_data.*


class ShowDataActivity : AppCompatActivity() {

    private lateinit var tvInputUsername : TextView
    private lateinit var tvInputEmail : TextView
    private lateinit var tvInputPassword : TextView
    private lateinit var tvInputConfirmPassword : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_data)

        tvInputUsername = tv_inputUsername
        tvInputEmail = tv_inputEmail
        tvInputPassword = tv_inputPassword
        tvInputConfirmPassword = tv_inputresetpwd

        val intentTerima = intent
        val terimaUsername = intentTerima.getStringExtra("amplopUsername")
        val terimaEmail = intentTerima.getStringExtra("amplopEmail")
        val terimaPassword = intentTerima.getStringExtra("amplopPassword")
        val terimaConfirmPassowrd = intentTerima.getStringExtra("amplopConfirmPassword")

        tvInputUsername.text = terimaUsername
        tvInputEmail.text = terimaEmail
        tvInputPassword.text = terimaPassword
        tvInputConfirmPassword.text = terimaConfirmPassowrd
    }
}