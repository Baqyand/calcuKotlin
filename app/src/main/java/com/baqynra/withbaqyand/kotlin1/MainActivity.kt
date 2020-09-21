package com.baqynra.withbaqyand.kotlin1

import android.content.Intent
import android.media.tv.TvView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_calculate.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_calculate ->{

                val lengt = edt_length.text.toString().trim()
                val widt = edt_width.text.toString().trim()
                val heig = edt_height.text.toString().trim()

                val calcu = lengt.toDouble() * widt.toDouble() * heig.toDouble()

                val myfragment = BlankFragment.new(calcu.toString())

                val fragmentManager = supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.add(R.id.fram1, myfragment)
                fragmentTransaction.commit()



//                moveIntent.putExtra(MoveDataActivity.EXTRA_RESULT,calcu.toInt())
//                startActivity(moveIntent)

            }
        }
    }
}