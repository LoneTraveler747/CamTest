package com.example.camtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.camera.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.camera)
        if(savedInstanceState != null){
            result.text = savedInstanceState.getString("key")
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("key", result.text.toString())
    }
    fun button(view: View){
        val but: Button = findViewById(view.id)
        var och = 0;
        var score = 0;
        if(true1.isChecked){
            score++
        }
        if(chek1.isChecked){
            score++
        }
        if(chek2.isChecked){
            score++
        }
        if(chek3.isChecked){
            och++
        }
        if(textView.text.toString() == "Да" || textView.text.toString() == "Согласен" || textView.text.toString() == "Да согласен"){
            score++
        }
        result.text = "Баллы: " + score.toString()+ " " + "Ошибок:" + " " + och
    }
}
