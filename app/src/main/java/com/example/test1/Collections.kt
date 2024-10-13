package com.example.test1

fun ContohList(){
    println("=== List ===")
    // List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Squere", "Triangle")
    println(shape)

    //Menambahkan data ke dalamm List Mutable
    shape.add("Cirle")
    println(shape)

    //Menghapus data dari list mutable
    shape.remove("Triangle")
    println(shape)

    println(shape.first())
    println(shape.last())
    println(shape.count())

    shape.removeAt(1)
    println(shape)

    // Mengubah data didalam list mutable
    shape[0] = "Oval"
    println(shape)

    //list Read-only
    val shapeLocked: List<String> = shape
    println(shapeLocked)


}

    fun main(){
        println(ContohList())
    }