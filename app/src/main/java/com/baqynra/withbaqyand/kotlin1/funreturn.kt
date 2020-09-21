package com.baqynra.withbaqyand.kotlin1

fun hai(a: Int, b: Int): String{
    if (b == 0){
        return "Tak terhingga"
    }else{
        val result = a / b
        return result.toString()
    }
}

fun main(){
    println(hai(10, 2))

   val result = hai(300,0)
    println(result)
}