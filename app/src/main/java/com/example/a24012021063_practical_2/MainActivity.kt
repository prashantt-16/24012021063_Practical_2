package com.example.a24012021063_practical_2

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        display(msg="onCreate method is called")
    }

    override fun onStart() {
        display(msg = "onStart method is called")
        super.onStart()
    }

    override fun onPause() {
        display(msg = "onPause method is called")
        super.onPause()
    }

    override fun onResume() {
        display(msg ="onResume method is called")
        super.onResume()
    }

    override fun onStop() {
        display(msg = "onStop method is called")
        super.onStop()
    }

    override fun onRestart() {
        display(msg = "onRestart method is called")
        super.onRestart()
    }

    override fun onDestroy() {
        display(msg="onDestroyed method is called")
        super.onDestroy()
    }
    fun display(msg: String){
        Log.i(TAG,msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

    }
}