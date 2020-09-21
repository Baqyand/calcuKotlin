package com.baqynra.withbaqyand.kotlin1

fun totalitas( vale: String?, vararg values: Int){
    var total = 0.0
    for( value in values){
        total += value
    }
    total /= values.size
    println("final Values $vale = $total")
}
fun main (){
    val result = totalitas("qwe", 123,21,2,2,2,312,31231)
}