package com.example.phonecopy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.phonecopy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        with(binding) {
            mainButton.setOnClickListener {
                startSecondActivity()

            }

        }
    }

    private fun startSecondActivity(){
        val firstName =binding.firstNameTextField.editText?.text.toString()
        val surname=binding.surnameTextField.editText?.text.toString()
        val intent = Intent(this,SecondActivity::class.java).also {
            it.putExtra(FIRST_NAME_EXTRA,firstName)
            it.putExtra(SURNAME_EXTRA,surname)
        }
        startActivity(intent)

    }    }