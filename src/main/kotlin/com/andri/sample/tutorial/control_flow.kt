package com.andri.sample.tutorial

fun main(args : Array<String>) {

    val age = 15

    if  (age <= 12)  {
        println("Child")
    } else if (age >= 13 && age <= 17)  {
        println("Teenager")
    } else {
        println("Adult")
    }

}
