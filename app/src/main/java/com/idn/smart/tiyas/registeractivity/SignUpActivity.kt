package com.idn.smart.tiyas.registeractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnDaftar: Button
    private lateinit var etUsername: EditText
    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var etConfirmPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        etUsername = et_username
        etEmail = et_email
        etPassword = et_password
        etConfirmPassword = et_confirmPassword
        btnDaftar = btn_daftar
       btnDaftar.setOnClickListener(this)

    }

    override fun onClick(p0: View) {
        val inputUsername = etUsername.text.toString().trim()
        val inputEmail = etEmail.text.toString().trim()
        val inputPassword = etPassword.text.toString().trim()
        val inputConfimPassword = etConfirmPassword.text.toString().trim()

        var isEmptyField = false
        //membuat variable jika kosong
        when {
            inputUsername.isEmpty() -> {
                isEmptyField = true
                etUsername.error = getString(R.string.txt_error)
            }
            //
            inputEmail.isEmpty() -> {
                isEmptyField = true
                etEmail.error = getString(R.string.txt_error)
            }
            inputPassword.isEmpty() -> {
                isEmptyField = true
                etPassword.error = getString(R.string.txt_error)
            }

            inputConfimPassword.isEmpty() -> {
                isEmptyField = true
                etConfirmPassword.error = getString(R.string.txt_error)
            }
        }
        if (!isEmptyField){
            val intentData = Intent(this,ShowDataActivity::class.java)
            intentData.putExtra("amplopUsername",inputUsername)
            intentData.putExtra("amplopEmail",inputEmail)
            intentData.putExtra("amplopPassword",inputPassword)
            intentData.putExtra("amplopConfirmPassword",inputConfimPassword)
            startActivity(intentData)
        }


    }
}