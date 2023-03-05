package com.example.sahajsfirstapplication


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("myTag","MainActivity : onCreat")
        val greetingTextView = findViewById<TextView>(R.id.userview)
        val inputField = findViewById<EditText>(R.id.shorttv)
        val inputButton = findViewById<Button>(R.id.firstbutton)
        val offerButton = findViewById<Button>(R.id.btnforuser)
        greetingTextView.text = "hello android"

            var enterdName = ""

        inputButton.setOnClickListener{
             enterdName = inputField.text.toString()
            val message = "welcome $enterdName"
            var b:Boolean = enterdName != ""
            for(i in enterdName){
                if(i in '1'..'9'){
                    b = false
                    break
                }
            }
            if(b){
                greetingTextView.text = message
                offerButton.visibility = VISIBLE
            }
            else{
                Toast.makeText( this@MainActivity,
                    "invalid input",
                    Toast.LENGTH_SHORT).show()
                greetingTextView.text = ""
                offerButton.visibility = INVISIBLE
            }
                 inputField.text.clear()

        }

        offerButton.setOnClickListener{
            val intent = Intent(this,SecondActivity2::class.java)
            intent.putExtra("USER",enterdName)
            startActivity(intent)


        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("myTag","MainActivity : onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("myTag","MainActivity : onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("myTag","MainActivity : onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("myTag","MainActivity : onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("myTag","MainActivity : onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("myTag","MainActivity : onRestart")

    }

}