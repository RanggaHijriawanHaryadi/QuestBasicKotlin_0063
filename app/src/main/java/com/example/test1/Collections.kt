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

// Set adalah Kumpulan data yangg tidak memiliki posisi atau urutan tertemtu dan hanya menyimpan data unik(tidak ada duplikasi)
// Set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Set bersifat mutuble dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Set Read-Only menggunakan setof
// Set Mutable menggunakan mutableSetOf

fun ContohSet() {
    println()
    println("=== Set ===")

    // Set Read-only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    // Set Mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam set Mutable
    shape.add("Rectangle")
    println(shape)
}


fun main(){
    println(ContohList())}