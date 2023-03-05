package com.example.sahajsfirstapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)
        val userName = intent.getStringExtra("USER")//getting string from previous activity
        val messageText = findViewById<TextView>(R.id.eligibletext)
        val message = "$userName , Hooray you have got free services for 3 months "
        messageText.text = message
        val adsbutton = findViewById<Button>(R.id.ads11)
        var clicks: Int = 0

        adsbutton.setOnClickListener {
            Toast.makeText(
                this@SecondActivity2,
                "ok good, $userName has clicked $clicks times",
                Toast.LENGTH_SHORT
            ).show()
            clicks++
        }
        clicks = 0


    }


    override fun onStart() {
        super.onStart()
        Log.i("myTag", "SecondActivity : onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("myTag", "SecondActivity : onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("myTag", "SecondActivity : onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("myTag", "SecondActivity : onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("myTag", "SecondActivity : onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("myTag", "SecondActivity : onRestart")

    }
}