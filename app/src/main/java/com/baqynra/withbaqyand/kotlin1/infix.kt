package com.baqynra.withbaqyand.kotlin1

infix fun String.to(type: String):String{
    if (type == "UP"){
        return this.toUpperCase()
    }
    else{
        return this.toLowerCase()
    }

}

fun main(){
    val result = "Bama Qyandija D" to "UP"
    println(result)
}