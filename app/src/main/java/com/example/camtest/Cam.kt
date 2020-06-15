package com.example.camtest

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle import android.provider.MediaStore
import android.view.View import android.content.Intent
import android.graphics.Bitmap
import kotlinx.android.synthetic.main.activity_main.*

class Cam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
     super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
        photo.setOnClickListener {
            val imageTakeIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(imageTakeIntent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == 1 && resultCode == Activity.RESULT_OK){
            val extras = data?.extras
            val bitmap = extras?.get("data") as Bitmap?
            photo.setImageBitmap(bitmap)
        }
    }

    fun onclick(view : View){
        var intenT = Intent(this, MainActivity::class.java)
        startActivity(intenT)
    }
}