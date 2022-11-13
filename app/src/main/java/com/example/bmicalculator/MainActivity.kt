package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.bmicalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Clicks(view: View) {
        var VoidRost = findViewById<EditText>(R.id.editRost).text.toString()
        var VoidVes = findViewById<EditText>(R.id.editVes).text.toString()
        var RostHuman =  VoidRost.toDouble()
        var VesHuman =   VoidVes.toDouble()
        Infomation(this, RostHuman, VesHuman).justdoing()
    }

    fun Clean(view: View) {
        var VoidRost = findViewById<EditText>(R.id.editRost).text.toString()
        var VoidVes = findViewById<EditText>(R.id.editVes).text.toString()
        var RostHuman =  VoidRost.toDouble()
        var VesHuman =   VoidVes.toDouble()
        Infomation(this, RostHuman, VesHuman).nulls0()
    }
}