package com.valeriayorulmaz.odevler

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println("Lütfen yaşınızı giriniz.")

    try {
        val yas = scanner.nextInt()
        if (yas >= 18) {

            println("Oy kullanabilirsiniz.")

        }else{
            println("Oy kullanamazsınız.")
        }

    }catch (e:Exception ){
        println("Geçerli yaş giriniz.")
    }
}
