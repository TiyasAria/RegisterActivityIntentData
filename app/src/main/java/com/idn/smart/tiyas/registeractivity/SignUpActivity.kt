package com.idn.smart.tiyas.registeractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
       btn_daftar.setOnClickListener(this)

    }

    override fun onClick(p0: View) {
        val inputUsername = et_username.text.toString().trim()
        val inputEmail = et_email.text.toString().trim()
        val inputPassword = et_password.text.toString().trim()
        val inputConfimPassword = et_confirmPassword.text.toString().trim()

        var isEmptyField = false
        //membuat variable jika kosong
        when {
            inputUsername.isEmpty() -> {
                isEmptyField = true
                et_username.error = getString(R.string.txt_error)
            }
            //
            inputEmail.isEmpty() -> {
                isEmptyField = true
                et_email.error = getString(R.string.txt_error)
            }
            inputPassword.isEmpty() -> {
                isEmptyField = true
                et_password.error = getString(R.string.txt_error)
            }

            inputConfimPassword.isEmpty() -> {
                isEmptyField = true
                et_confirmPassword.error = getString(R.string.txt_error)
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