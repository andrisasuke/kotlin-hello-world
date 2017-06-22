package com.andri.sample.tutorial

fun main (params : Array<String>) {
    var age = 50

    println("total " + (2 * 4 - (3 + 7)) )
    age *= 2
    println("age ${age}")

    var sum = 25

    // Evaluate age before incrementing it by 1.
    sum++
    println("sum " + sum)
    // Increment age by 1 and then evaluate it.
    ++sum
    println("sum " + sum)
    // Evaluate age before decrementing it by 1.
    sum--
    println("sum " + sum)
    // Decrement age by 1 and then evaluate it.
    --sum
    println("sum " + sum)


    val name1 = "Joe"
    val name2 = "Joe"

    println("age == 100 " + (age == 100))
    println("age <= 50 " + (age <= 50) )
    println("Sun == Earth " + ("Sun" == "Earth") )

    // Using "===" operator to check that the object references are the same
    println("name1 === name2 " + (name1 === name2) )
    println("string equals " + name1.equals(name2) )
    println("contains " + ( "Plant".contains("P")) )
    println("contains " + (!"Plant".contains("P")) )
}
