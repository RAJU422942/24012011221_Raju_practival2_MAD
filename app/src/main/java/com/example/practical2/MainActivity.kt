package com.example.practical2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "onCreate function called.")

        Toast.makeText(this, "onResume function called.", Toast.LENGTH_SHORT).show()

        Snackbar.make(findViewById(R.id.main),
            "onResume function called.",
            Snackbar.LENGTH_SHORT).show()
    }


    override fun onResume() {
        super.onResume()

        Log.i(TAG, "onResume function called.")

        Toast.makeText(this,
            "onResume function called.",
            Toast.LENGTH_SHORT).show()

        Snackbar.make(findViewById(R.id.main),
            "onResume function called.",
            Snackbar.LENGTH_SHORT).show()
    }
    override fun onStart() {
        super.onStart()

        Log.i(TAG, "onStart function called.")

        Toast.makeText(this,
            "onStart function called.",
            Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        super.onPause()

        Log.i(TAG, "onPause function called.")
    }
    override fun onStop() {
        super.onStop()

        Log.i(TAG, "onStop function called.")
    }

    override fun onRestart() {
        super.onRestart()

        Log.i(TAG, "onRestart function called.")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i(TAG, "onDestroy function called.")
    }
}