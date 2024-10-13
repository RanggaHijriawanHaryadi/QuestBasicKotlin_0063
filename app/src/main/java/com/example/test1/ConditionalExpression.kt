package com.example.test1

import java.util.concurrent.locks.Condition

// Conditional Expression
// Conditional expression adalah ekspresi yang mengembalikan nilai berdasarkan kondisi tertentu
// Conditional expression menggunakan if-else, when, dan try-catch

fun ConditionalStatement(){
    println("=== Conditional Expression ===")

    // If-Else
    val number = 10
    if (number > 0) {
        println("Positive Number")
    } else{
        println("Negative Number")
    }

    // When
    val day = 1
    when (day){
        1 -> println("Sunday")
        2 -> println("Mondey")
        3 -> println("Tueday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid Day")
    }
}