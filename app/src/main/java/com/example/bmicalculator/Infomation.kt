package com.example.bmicalculator

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class Infomation(val context : Context, val Rost : Double, val Weight : Double) {
    var tv1 = (context as MainActivity).findViewById<TextView>(R.id.tvResult)
    var tvindex = (context as MainActivity).findViewById<TextView>(R.id.textViewInex)
    var EditV = (context as MainActivity).findViewById<TextView>(R.id.editVes)
    var EditR = (context as MainActivity).findViewById<TextView>(R.id.editRost)
    var image = (context as MainActivity).findViewById<ImageView>(R.id.imageViewHealthy)

    fun justdoing() {
        var v = Rost* Rost
        var Res = Weight / v * 10000
        if ( Res  <= 18 ){
            image.visibility = View.VISIBLE
            image.setImageResource(R.drawable.underweight)
            tv1.text = "Вам нужно поднабрать в весе"
            tvindex.text = Res.toString()
        }
        else if ((Res >= 18.5) && (Res <= 24.9)) {
            image.visibility = View.VISIBLE
            image.setImageResource(R.drawable.healthy)
            tv1.text = "Вы здоровы!"
            tvindex.text = Res.toString()
        }
        else if ((Res > 25) && (Res < 29.9)) {
            image.visibility = View.VISIBLE
            image.setImageResource(R.drawable.overweight)
            tv1.text = "Избыточный вес"
            tvindex.text = Res.toString()

        }
        else if(Res > 30){
                image.visibility = View.VISIBLE
                image.setImageResource(R.drawable.obese)
                tv1.text = "У вас ожирение"
                tvindex.text = Res.toString()
        }
    }

    fun nulls0(){
        EditR.text = ""
        EditV.text = ""
        tv1.text = ""
        tvindex.text = ""
        image.visibility = View.GONE
        Toast.makeText(context, "Все данные обнулены", Toast.LENGTH_SHORT).show()
    }
}