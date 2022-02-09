package com.rk.coroutines_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.rk.coroutines_1.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding =  ActivityMainBinding.inflate(layoutInflater)


        GlobalScope.launch(Dispatchers.IO) {
            while(true){
                //Log.d("HEY"," still running");
            }
            delay(2000)
        }
        GlobalScope.launch(Dispatchers.IO) {
            delay(10000)

            Intent(this@MainActivity, MainActivity2::class.java).also {
                startActivity(it)
                finish()
            }

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("HEY"," A1 onDestroy");
    }

    override fun onPause() {
        super.onPause()
        Log.d("HEY"," A1 onPause");
    }

    override fun onStop() {
        super.onStop()
        Log.d("HEY"," A1 onStop");
    }
}