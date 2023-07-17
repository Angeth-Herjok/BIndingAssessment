package com.example.assessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.assessment.databinding.ActivityLoginBinding
import com.example.assessment.databinding.ActivitySignUpBinding

class SignUP : AppCompatActivity() {
    lateinit var binding:ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        binding= ActivitySignUpBinding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.btnSignUP.setOnClickListener {
            val intent = Intent(this, SignUP::class.java)
            startActivity(intent)
        }
        fun validateSignUp() {
            binding.tilEmail.error = null
            binding.tilPassword.error = null
            binding.tilPhone.error = null
            binding.tilUserName.error = null


            val phone = binding.etPhone.text.toString()
//        val lastName = binding.etPassword.text.toString()
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()
            val userName = binding.etUserName.text.toString()
            var error = false

            if (userName.isBlank()) {
                binding.tilUserName.error = "Valid email required"
                error = true
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
                error = true
            }
            if (phone.isBlank()) {
                binding.tilPhone.error = "Correct phone required"
                error = true
            }
//        if (password!=passwordConfirmation){
//            binding.tilConfirmPassword.error="password confirmation does not match password"
//            error=true
//        }
            if (!error) {
                Toast.makeText(this, "$email $password", Toast.LENGTH_LONG).show()
            }
        }

    }
}