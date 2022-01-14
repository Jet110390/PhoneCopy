package com.example.phonecopy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.phonecopy.databinding.ActivitySecondBinding

class SecondActivity: AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            secondButton.setOnClickListener{
                startThirdActivity()
            }
            firstBackButton.setOnClickListener{
                backToMainActivity()
            }
        }
    }
    private fun backToMainActivity(){
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

    private fun startThirdActivity(){
        val email = binding.emailTextField.editText?.text.toString()
//        val email =binding.emailTextField.toString()
        val intent = Intent(this,ThirdActivity::class.java).also {
            it.putExtra(FIRST_NAME_EXTRA, intent.getStringExtra(FIRST_NAME_EXTRA))
            it.putExtra(SURNAME_EXTRA, intent.getStringExtra(SURNAME_EXTRA))
            it.putExtra(EMAIL_EXTRA,email)
        }
        startActivity(intent)

    }
}