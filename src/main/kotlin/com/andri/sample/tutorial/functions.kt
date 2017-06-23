package com.andri.sample.tutorial

// function single expression
fun double(x: Int) = x * 2

// Lambda
fun greeter(msg: (String, String) -> String) {
    println("Hello ${msg("p1", "p2")}")
}

// Extension function
fun String.isNumber(): Boolean {
    println("evaluate value "+ this)
    var valid = true
    try {
        Integer.valueOf(this)
    } catch (ex: NumberFormatException) {
        println("error ${ex.message}")
        valid = false
    }
    return valid
}

// Infix function
// They are member functions or extension functions
// They have a single parameter
infix fun Int.sum(x: Int): Int {
    return this * x
}

// function with default argument
fun read(b: Array<Int>, off: Int = 0, len: Int = b.size) {
    println("array [$len] = ${b[len-1]}")
    println("off $off")
}

// Unit-returning functions
fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello ${name}")
    else
        println("Hi there!")
     return Unit // return is optional
}

fun main (args : Array<String>) {
    println("double " + double(4))

    greeter { prefix, postfix ->
        "${prefix} Jane Doe $postfix"
    }

    println("7 is valid number: ${"7".isNumber()}")
    println("Text is valid number: ${"Text".isNumber()}")

    println("infix func "+ (1 sum 2))

    read(arrayOf(1, 5, 6))

    // Named argument
    read(b = arrayOf(3, 9, 8, 5), off = 10)

    println("return Unit " + printHello("test"))
}