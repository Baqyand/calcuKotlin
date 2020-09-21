package com.baqynra.withbaqyand.kotlin1

    fun kalkulate(a: Int? = null , b: Int? = null , c: String? = null) {

        println("\n--- Simple Calculator ---")
        println("1.\tPenjumlahan")
        println("2.\tPengurangan")
        println("3.\tPerkalian")
        println("4.\tPembagian")
        val c = readLine()!!.toInt()

        val hasil = when (c) {
            1 -> "Tambah ( + ) Value ${a!! + b!!}"
            2 -> "Kurang ( - ) Value ${a!! - b!!}"
            3 -> "kali ( * ) Value ${a!! * b!!}"
            else -> "Bagi ( / ) Value ${a!! / b!!}"
        }
        println("hasilnya adalah : $hasil")
    }
fun main(){
    do {
        println("Program Calkulator sederhana :v")
        println("masukan angka 1 : ")
        var bil1 = readLine()
        println("masukan angka 2 : ")
        var bil2 = readLine()
            if (isInputCorrect(bil1) && isInputCorrect(bil2) ) {
            kalkulate(a = bil1!!.toInt(), b = bil2!!.toInt())
            }
         else println("program selesaii \n")
        println("ulang ? y/n")
        val al = readLine()

    }
    while (al == "y" || al == "Y")
 }

