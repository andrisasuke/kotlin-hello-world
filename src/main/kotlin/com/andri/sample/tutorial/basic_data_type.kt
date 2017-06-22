package com.andri.sample.tutorial

fun main(args : Array<String>) {
    // Numeric
    var num: Float = 10.5f
    num = num + 7
    println("Num " + num)
    println("toString " + 7.toString())

    // Pair
    val pr: Pair<Int, String>  = Pair(first = 1, second = "aa")
    println("first " + pr.first)
    println("first component " + pr.component2())

    // String
    val simpleStr = "A simple string"
    println("simple String " + simpleStr);
    println("take String " +simpleStr.take(5))
    val rawStr = """
Little brown fox jumps over small rabbit hole.
White rabbit counts to 5:
   1
   2
   3
            4
            5
"""
    println("raw string " + rawStr)

    // Char
    var aChar: Char? = 'A'
    println("char " + aChar)
    for (x in "Hello") {
        println(x)
    }

    var anyParam: Any? = 9;
    anyParam = "8"
    println("Any " + anyParam)
}