package com.baqynra.withbaqyand.kotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveDataActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_RESULT = "extra_result"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_data)

        val tvdata: TextView = findViewById(R.id.tv_data_received)

        val result = intent.getIntExtra(EXTRA_RESULT, 0)

        val text = "Result : $result"
        tvdata.text = text

    }
}