package com.example.desafio2

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.btnregister
import kotlinx.android.synthetic.main.activity_register.*


class RegisterActivity : AppCompatActivity() {
    private var nameCheck = false
    private var emailCheck = false
    private var passwordCheck = false
    private var repeatPasswordCheck = false
    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        supportActionBar?.title = "Register"
        supportActionBar?.setDisplayHomeAsUpEnabled(true); //Mostrar o botão
        supportActionBar?.setHomeButtonEnabled(true);

        initComponents()
    }

    private fun initComponents() {
        btnRegister = findViewById(R.id.btnregisterR)
        verifyButton()
        tiNameInternR.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(p0: Editable?) {
                if (p0.toString().isBlank()) {
                    tiNameInternR.error = getString(R.string.campo_vazio, getString((R.string.name_hint)))
                    nameCheck = false
                } else {
                    nameCheck = true
                }
                verifyButton()
            }
        })
        tiEmailInternR.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(p0: Editable?) {
                if (p0.toString().isBlank()) {
                    tiEmailInternR.error = getString(R.string.campo_vazio, getString(R.string.email_hint))
                    emailCheck = false
                } else {
                    emailCheck = true
                }
                verifyButton()
            }
        })
        tiPasswordInternR.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(p0: Editable?) {
                if (p0.toString().isBlank()) {
                    tiPasswordInternR.error = getString(R.string.campo_vazio, getString(R.string.password_hint))
                    passwordCheck = false
                } else {
                    passwordCheck = true
                }
                verifyButton()
            }
        })
        tiRepeatPasswordInternR.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(p0: Editable?) {
                if (p0.toString().isBlank()) {
                    tiRepeatPasswordInternR.error = getString(R.string.campo_vazio, getString(R.string.repeat_password))
                    repeatPasswordCheck = false
                } else {
                    repeatPasswordCheck = true
                }
                verifyButton()
            }
        })
        btnregisterR.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finishAffinity()
        }
    }
    private fun verifyButton() {
        btnregisterR.isEnabled = nameCheck && emailCheck && passwordCheck && repeatPasswordCheck
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }

}