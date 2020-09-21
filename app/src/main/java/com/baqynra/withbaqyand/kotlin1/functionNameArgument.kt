package com.baqynra.withbaqyand.kotlin1

fun full(a: String,b:String? = null, c:String? = "Deandra"){
    println("Haii $a $b $c")
}

fun main(){
    full("Bama ","Qyandija", c = readLine().toString())
}