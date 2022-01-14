package com.example.phonecopy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.phonecopy.databinding.ActivityFourthBinding

class FourthActivity: AppCompatActivity() {


    private lateinit var binding: ActivityFourthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            // Grabbing extras from intent
            thirdBackButton.setOnClickListener{
                backToMainActivity()
            }
//            firstNameTv.editText?.addTextChangedListener
            firstNameTv.text=intent.getStringExtra(FIRST_NAME_EXTRA)
            surnameTv.text = intent.getStringExtra(SURNAME_EXTRA)
            emailTv.text = intent.getStringExtra(EMAIL_EXTRA)
            passwordTv.text = intent.getStringExtra(PASSWORD_EXTRA)
        }

    }
    private fun backToMainActivity(){
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}







