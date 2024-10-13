package com.example.test1

import androidx.compose.ui.res.stringResource

// Lambda Functions
// Lambda fungctions adalah fungsi yang tidak memiliki nama
// Lambda fungction biasanya digunakan untuk membuat fungsi yang sederhana
// Lambda fungctions menggunakan tanda panah (->0 untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String): String{
    return string.uppercase()
}

//Dapat ditulis dalam ekspresi lambda sbb :
fun main() {
    uppercaseString("hello")
    println({ string: String -> string.uppercase() }("hello"))
// HELLO
}
