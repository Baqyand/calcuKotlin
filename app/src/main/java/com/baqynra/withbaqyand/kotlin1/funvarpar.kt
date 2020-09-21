package com.baqynra.withbaqyand.kotlin1

import android.service.autofill.LuhnChecksumValidator

fun vara(vararg values : Int): Int{
    var total = 0

    for (value in values){
        total += value
    }
    return total
}
fun main(){
//
    val result = vara(12312,232,212,3,21)
}