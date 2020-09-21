package com.baqynra.withbaqyand.kotlin1

fun hitung(vararg values : Int): Int{
    var total = 0

    for (value in values){
        total += value
    }

    return total
}

fun main(){
//     val values = arrayOf(10, 10 ,1223,11,2,34,2,1)
    val result = hitung(10, 10 ,1223,11,2,34,2,1)

    println(result)
}