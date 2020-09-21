package com.baqynra.withbaqyand.kotlin1
fun main(){
fun sayHello(name: String = ""): String {
//    return if (name == ""){
//            "Hai Indirkuhh"
//        } else  {
//        "Hello $name"
//        }
//    }

    return when (name) {
        "" -> "Hello Indirkuhh"
        else -> "Haiii $name"
    }
}
    println(sayHello())
    println(sayHello("Bama Qyandija Deandra"))
    }
