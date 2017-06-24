package com.andri.sample.tutorial

// Generic function
fun <T> T.basicToString() : String {
    return "$this to string"
}

fun <T: Number> combineToString(num1: T, num2: T) = "$num1-$num2"

// Variance
/**
class ClassName<TypeName>
class ClassName<*>
ClassName<in UpperBound>
ClassName<out LowerBound>
class Name<TypeName:UpperBound>
*/

abstract class Source<out T> {
    abstract fun nextT(): T
}

fun demo(str: Source<String>) {
    val objects: Source<Any> = str // This is OK, since T is an out-parameter
}

abstract class Comparable<in T> {
    abstract fun compareTo(other: T): Int
}

fun demo(x: Comparable<Number>) {
    x.compareTo(1.0) // 1.0 has type Double, which is a subtype of Number
    // Thus, we can assign x to a variable of type Comparable<Double>
    val y: Comparable<Double> = x // OK!
}

fun main(args: Array<String>) {
    println("basicToString: ${1.basicToString()}")
    println("combineToString: ${combineToString(1, 9)}")

    val takeList : MutableList<out Int> = mutableListOf(1, 5, 8, 3) // Java: List<? extends SomeType>
    val takenValue: Int = takeList[0] // OK, since upper bound is SomeType
    //takeList.add(takenValue) // Error, lower bound for generic is not specified

    val putList : MutableList<in Int> = mutableListOf(1, 5, 8, 3) // Java: List<? super SomeType>
    val valueToPut : Int = 3
    putList.add(valueToPut) // OK, since lower bound is SomeType
    var pl = putList[0] // This expression has type Any, since no upper bound is specified

}
