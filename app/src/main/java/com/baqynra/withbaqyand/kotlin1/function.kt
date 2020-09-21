package com.baqynra.withbaqyand.kotlin1

fun say(name: String?, lastname: String? = null){
    if(lastname == null){
        println("hallo $name")
    }
    else{
        println("hallo $name $lastname")
    }
}

fun main(){
    println("Silakan masukan nama : ")
    say(name = readLine(), lastname = readLine())
}
