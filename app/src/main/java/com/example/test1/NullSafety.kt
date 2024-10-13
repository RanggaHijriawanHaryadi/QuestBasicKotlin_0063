package com.example.test1

fun nullSafety(){
    // neverNull has String type
    var neverNull: String = "This can't be null"

    // Throws a compiler error
    // neverNull = null

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"
    // This is Ok
    nullable = null

    // Check for null in conditions
    if (neverNull == null){
        println("interredNonNull is null")
    } else {
        println("interredNonNull is not null")
    }

    // Safe call operator
    println(neverNull.length)//18
    println(nullable?.length) //null

    fun strLength(notNull: String): Int{
        return notNull.length
    }

    println(strLength(neverNull)) // 18
}

fun main(){
    nullSafety()
}