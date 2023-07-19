package com.valeriayorulmaz.odevler

import java.util.Scanner

    fun main(){

    val scanner =Scanner(System.`in`)

    println("Lütfen kullanıcı adınızı giriniz")

    val kullaniciAdi = scanner.nextLine()

    val scanner2 =Scanner(System.`in`)

    println("Lütfen şifrenizi giriniz")

    val sifre = scanner2.nextLine()
    if ( kullaniciAdi.equals( "ValeriaYorulmaz", ignoreCase = true) && sifre.equals("sifre123", ignoreCase = false) ){
        println("Kullanıcı bilgileriniz doğru. Giriş yaptınız.")
    }
    else{
        println("Kullanıcı Adınız veya Şifreniz yanlış. Lütfen tekrar deneyiniz!")

    }
}


