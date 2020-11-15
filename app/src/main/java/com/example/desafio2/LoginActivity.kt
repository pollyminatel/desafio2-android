package com.example.desafio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.btnregister

class LoginActivity : AppCompatActivity() {
    private var emailCheck = false
    private var passwordCheck = false
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.title = "Digital House Foods"
        initComponents()
    }
    private fun initComponents() {
        btnLogin = findViewById(R.id.btnlogin)
        verifyButton()
        tiEmailIntern.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(p0: Editable?) {
                if (p0.toString().isBlank()) {
                    tiEmailIntern.error = getString(R.string.campo_vazio, getString((R.string.email_hint)))
                    emailCheck = false
                } else {
                    emailCheck = true
                }
                verifyButton()
            }
        })
        tiSenhaIntern.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(p0: Editable?) {
                if (p0.toString().isBlank()) {
                    tiSenhaIntern.error = getString(R.string.campo_vazio)
                    passwordCheck = false
                } else {
                    passwordCheck = true
                }
                verifyButton()
            }
        })
        btnlogin.setOnClickListener {
            val intent = Intent(this, RestaurantActivity::class.java)
            startActivity(intent)
            finishAffinity()
        }
        btnregister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
    private fun verifyButton() {
        btnLogin.isEnabled = emailCheck && passwordCheck
    }
}