package com.andri.sample.tutorial

fun main(args : Array<String>) {

    val age = 15

    // :: If-Else ::
    if  (age <= 12)  {
        println("Child")
    } else if (age >= 13 && age <= 17)  {
        println("Teenager")
    } else {
        println("Adult")
    }

    // variable as if-statement
    val personType = if  (age <= 12)  {
        "Child"
    } else if (age >= 13 && age <= 17)  {
        "Teenager"
    } else {
        "Adult"
    }

    println("Person_type " + personType)

    // :: When ::
    val num = 77
    when (num) {
        in 1..10 -> println("Number is in the range")
        !in 10..20 -> println("Number is outside the range")
        else -> println("None of the above")
    }

    val text = "text"
    when (text) {
        "text" -> println("String is equals")
        else -> println("None of the above")
    }

    // when-statement instance-of
    val x = "text"
    val hasString = when (x) {
        is String -> true
        else -> false
    }
    println("is String " + hasString)

    val anyX: Any = 6
    when (anyX) {
        is Int -> println("is Int " + (anyX + 1) )
        is String -> println("is String "+ + (anyX.length + 1) )
        else -> println("None of the above")
    }

    // :: Nullable ::
    val name: String? = "Rover"
    if (name != null) println("Name starts with J: ${name.startsWith("J")}") else println("Name is null")

    // Else-if-null
    val nameSecond: String? = null
    println("else-if-null "  + nameSecond?.startsWith("R") ?: "name is null")

    // :: Loop ::
    val days = listOf("Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun")
    for (d in days)  {
        print(d)
        print(" ")
    }
    println()
    for (d in 'a'..'g') {
        print(d)
        print(" ")
    }

    // Loop range
    for (i in 1..100) {  }
    for (p in 2..100 step 2)
        for (z in 10 downTo 1) { }

    // Loop in Map
    val nzPop = mapOf("AUCK" to 1500000, "WLG" to 405000, "CHCH" to 500000, "GIS" to 36100)
    for ((key, value) in nzPop) {
        println("$key -> $value")
    }

    // :: While ::
    var number = 1
    while (number <= 10) {
        print(number)
        print(" ")
        ++number
    }

    // do-while
    println()
    number = 12
    do {
        print(number)
        print(" ")
        --number
    } while (number >= 10)
}
