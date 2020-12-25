package com.hichapp.flipcoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.motion.widget.MotionLayout
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val coin:ImageView = findViewById(R.id.img_coin)
        val number:TextView = findViewById(R.id.txt_number)
        val motionLayout:MotionLayout = findViewById(R.id.motionLayout)
        coin.setOnClickListener{
            it.isClickable = false
            CoroutineScope(Dispatchers.Main).launch{
                number.visibility = View.VISIBLE
                flip(it)
                delay(500)
                number.text = getRandomNumber().toString()
                showNumber(this@MainActivity, number)
                delay(1000)
                disposeNumber(motionLayout)
                delay(1000)
                number.text = ""
                motionLayout.progress = 0f
                coin.isClickable = true
            }

        }
    }
}