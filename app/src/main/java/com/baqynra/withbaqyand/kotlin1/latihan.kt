package com.baqynra.withbaqyand.kotlin1

fun main(args:Array<String>){
   val jepang = arrayOf("kirito", "karito" ,"kirimi")
    val inggris = arrayOf("dominic", "domino","dododo")
    val indo = arrayOf("bama", "satria", "rafin")

    println("masukan nama : ")
    val nama = readLine()

    when(nama){
        in indo-> println("orang indo")
        in inggris-> println("orang inggris")
        in jepang-> println("orang jepang")
        else -> println("entah bukan dari mana mana")

    }


//   var b = 0
//   var c = 0
//     for (item in a){
//         if (item == "Gold"){
//             b++
//
//         }
//         else (item == "Silver")
//         c++
//
//     }
//    println("total gold $b")
//    println("total silver $c")


//    if (a.equals("Gold")){
//        println()
//    }
//    else




}

