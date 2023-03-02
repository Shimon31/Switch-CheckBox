package com.example.class13_widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Toast
import com.example.class13_widget.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.switchBTN.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                Toast.makeText(this, "switch", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Not switch", Toast.LENGTH_SHORT).show()
            }
        }
        binding.AgreeCheckBox.setOnCheckedChangeListener{_, isChecked ->
            if (isChecked){
                Toast.makeText(this, "Checked", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Not checked", Toast.LENGTH_SHORT).show()
            }
        }
    }




    }
