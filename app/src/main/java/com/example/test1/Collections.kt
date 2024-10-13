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

    // Menghapus data dari Set Mutable
    shape.remove("Circle")
    println(shape)

    // Set Read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

// Map adalah Kumpulan data yang disusun dalam pasang key-value
// Map bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Maps bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Maps Read-Only menggunakan mapOf
// Maps Mutable menggunakan mutableMapof

fun ContohMap(){
    println()
    println("=== Map ===")
    // Map Read-only
    val readOnlyshape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyshape)

    // Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    // Menambahkan data ke dalam Map Mutable
    shape["Rectangle"] = 4
    println(shape)

    // Menghapus data dari Map Mutable
    shape.remove("Circel")
    println(shape)

    // Mengubah data di dalam Map Mutable
    shape["Square"] = 5
    println(shape)

    // Map Read-Only
    val shapeLocked: Map<String,Int> = shape
    println(shapeLocked)
}


fun main(){
    println(ContohList())}