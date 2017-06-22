package com.andri.sample

fun getGreeting(name: String?): String {
    val words = mutableListOf<String>()
    words.add("Hello,")
    words.add("world!")
    return words.plus(name ?:"").joinToString(separator = " ")
}

fun main(args: Array<String>) {
    println(getGreeting("Test"))
}
