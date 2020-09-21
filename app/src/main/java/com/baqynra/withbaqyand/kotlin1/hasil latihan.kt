package com.baqynra.withbaqyand.kotlin1

class Calculator(private val operasi: Int, private val value1: Double, private val value2: Double) {

    // return operasi yang dipilih user

    val operasiPilihan: String
        get() {
            return when (operasi) {
                1 -> "Penjumlahan"
                2 -> "Pengurangan"
                3 -> "Perkalian"
                else -> "Pembagian"
            }
        }

    // ubah hasil menjadi dua angka di belakang koma

    fun formatDouble(value: Double) = String.format("%.2f", value).toDouble()

    // return hasil perhitungan

    val hasilPerhitungan: Double
        get() {
            return when (operasi) {
                1 -> formatDouble(value1 + value2)
                2 -> formatDouble(value1 - value2)
                3 -> formatDouble(value1 * value2)
                else -> formatDouble(value1 / value2)
            }
        }
}

// return true jika value berupa angka
// contoh: -13.5 -> true

fun isMatches(value: String): Boolean = value.matches("-?\\d+(\\.\\d+)?".toRegex())

// return true jika input dari user berupa angka dan tidak null

fun isInputCorrect(value: String?): Boolean {
    return if (value == null) {
        false
    } else {
        isMatches(value)
    }
}

fun main() {

    // startCalculator: perulangan selama nilainya true

    var startCalculator = true

    while (startCalculator) {

        println("\n--- Simple Calculator ---")
        println("1.\tPenjumlahan")
        println("2.\tPengurangan")
        println("3.\tPerkalian")
        println("4.\tPembagian")

        print("\nMasukkan pilihan\t: ")
        val pilihan = readLine()

        // program berhenti jika user menginputkan bukan angka
        // atau angka yang kurang dari 0 atau lebih dari 4

        if (isInputCorrect(pilihan)) {
            if (pilihan!!.toInt() < 1 || pilihan.toInt() > 4) {
                startCalculator = false
                println("\nInput salah! program selesai.")
                continue
            }
        } else {
            startCalculator = false
            println("\nInput salah! program selesai.")
            continue
        }

        print("\nMasukkan bilangan 1\t: ")
        val bilangan1 = readLine()

        print("Masukkan bilangan 2\t: ")
        val bilangan2 = readLine()

        // program berhenti jika user menginputkan bukan angka

        if (isInputCorrect(bilangan1) && isInputCorrect(bilangan2)) {

            // membuat object dan menampilkan hasil perhitungan

            val calculator =  Calculator(pilihan.toInt(), bilangan1!!.toDouble(), bilangan2!!.toDouble())

            println("\nHasil ${calculator.operasiPilihan}\t: ${calculator.hasilPerhitungan}\n")

            print("Hitung lagi? y = Yes, else = No : ")
            val ulangLagi = readLine()

            // jika user menginputkan y atau Y maka program akan berjalan kembali
            // selain itu program berhenti

            if (ulangLagi == null) {
                startCalculator = false
                println("\nInput salah! program selesai.")
            } else {
                if (ulangLagi.toString() == "y" || ulangLagi == "Y") {
                    continue
                } else {
                    startCalculator = false
                    println("\nProgram selesai.")
                }
            }

        } else {
            startCalculator = false
            println("\nInput salah! ")
        }
    }
}