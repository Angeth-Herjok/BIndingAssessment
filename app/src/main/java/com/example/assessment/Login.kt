package com.example.assessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.assessment.databinding.ActivityLoginBinding

import com.example.assessment.databinding.ActivityMainBinding

class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding=ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.btnSignup.setOnClickListener {
            val intent= Intent(this,SignUP::class.java)
            startActivity(intent)
        }

    }
    fun validateSignUp() {
        binding.tilEmail.error=null
        binding.tilPassword.error=null
//        binding.tilConfirmPassword.error=null


        val firstName = binding.etEmail.text.toString()
        val lastName = binding.etPassword.text.toString()
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()
//        val passwordConfirmation = binding.etConfirmPassword.text.toString()
        var error=false

        if (firstName.isBlank()) {
            binding.tilEmail.error = "Valid email required"
            error=true
        }
//        if (lastName.isBlank()) {
//            binding.tilEmail.error = "first name required"
//            error=true
//        }
//        if (email.isBlank()) {
//            binding.tilEmail.error = "first name required"
//            error=true
//        }
        if (password.isBlank()) {
            binding.tilPassword.error = "Correct password required"
            error=true
        }
//        if (passwordConfirmation.isBlank()) {
//            binding.tilConfirmPassword.error = "Correct password required"
//            error=true
//        }
//        if (password!=passwordConfirmation){
//            binding.tilConfirmPassword.error="password confirmation does not match password"
//            error=true
//        }
        if (!error){
            Toast.makeText(this,"$email $password", Toast.LENGTH_LONG).show()
        }
    }

}