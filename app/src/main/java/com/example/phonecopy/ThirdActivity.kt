package com.example.phonecopy

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import androidx.appcompat.app.AppCompatActivity
import com.example.phonecopy.databinding.ActivityThirdBinding

class ThirdActivity: AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)



        with(binding) {
            thirdButton.setOnClickListener{
                startFourthActivity()
            }
            secondBackButton.setOnClickListener{
                backToSecondActivity()
            }
        }
    }
    private fun backToSecondActivity(){
        val intent=Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }
    private fun startFourthActivity(){
        val password = binding.passwordTextField.editText?.text.toString()
        val intent = Intent(this, FourthActivity::class.java).also {
            it.putExtra(FIRST_NAME_EXTRA, intent.getStringExtra(FIRST_NAME_EXTRA))
            it.putExtra(SURNAME_EXTRA, intent.getStringExtra(SURNAME_EXTRA))
            it.putExtra(EMAIL_EXTRA, intent.getStringExtra(EMAIL_EXTRA))
            it.putExtra(PASSWORD_EXTRA, password)
        }
        startActivity(intent)
    }
}