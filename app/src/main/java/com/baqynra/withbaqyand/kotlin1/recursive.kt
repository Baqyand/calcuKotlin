package com.baqynra.withbaqyand.kotlin1

fun main() {
//    fun factoriallop(value: Int): Int{
//        var result = 1
//        for (i in value downTo 1){
//            result += i
//        }
//        return result
//    }
//    println(factoriallop(10))
    fun factorialRecursive(value: Int): Int{
    return when(value){
        1 -> 1
        else -> value * factorialRecursive(value - 1)
        }
    }
    println(factorialRecursive(10))
}