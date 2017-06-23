package com.andri.sample.tutorial

class VerySimpleClass

class Order( item: String, quantity: Int, price: Double) {

    // Setter and Getter
    var item: String  = item // the initializer value is written directly to the backing `field`
        get() = "get $field"
        set(value) {
            field = "itemId $value"
        }
    val quantity = quantity
    var price = price

    fun updatePrice(newPrice: Double){
        this.price = this.price + newPrice
    }
}

// :: Data class ::
data class Person(var firstName: String, var lastName: String, var age: Int)

// :: Enum ::
enum class Day {
    MON, TUE, WED, THUR, FRI, SAT, SUN
}

// :: Object ::
// single instance class
object Singleton {
    val msg = "Hello World! :)"
    fun info() : String = "just a Singleton info"
}

// :: Companion ::
// static block for functions and properties
class Companion {
    companion object {
        val meta = "Static property"
        fun info() = "Example class with a static function and property"
    }

    fun nonStaticInfo() : String = "this is non static function"
}

fun main(args: Array<String>) {

    // Creating an object is similar to what you can do in Python.
    val simpleClass = VerySimpleClass()
    println("Basic Class: ${simpleClass.hashCode()}")

    val order = Order("Widgets", 5, 9.99)
    println("Order Info Before: Item - ${order.item}, Quantity - ${order.quantity}, Total Price: ${order.price}")
    order.item = "test*Widgets"
    order.price = 25.78
    println("Order Info After: Item - ${order.item}, Quantity - ${order.quantity}, Total Price: ${order.price}")
    order.updatePrice(1.2)
    println("Order Info: Item - ${order.item}, Quantity - ${order.quantity}, Total Price: ${order.price}")

    // Call Data class `Person`
    val person = Person(lastName = "Bloggs", firstName = "Joe", age = 20)
    val (firstName, lastName, age) = person
    println("Data Class: $person")
    println("Object Destructuring: First Name - $firstName, Last Name - $lastName, Age - $age")

    // Enum
    val currentDay = Day.SUN

    println("Day from string ${Day.valueOf("MON")}")

    try {
        var mon: Day = Day.valueOf("MON-typo")
    } catch (ex : Exception){
        println("Failed convert Day enum from string, ${ex.message}")
    }

    print("Day: ")
    for (d in Day.values()) {
        print("$d")
        print(" ")
    }
    println()

    println("Current Day: $currentDay")
    when (currentDay) {
        Day.MON, Day.TUE, Day.WED, Day.THUR, Day.FRI -> println("Weekday")
        Day.SAT, Day.SUN -> println("Weekend")
    }

    val dayType: String = when (Day.MON) {
        Day.MON, Day.TUE, Day.WED, Day.THUR, Day.FRI -> "Weekday"
        else -> "Weekend"
    }

    println("Day.MON is $dayType")

    println("Singleton: ${Singleton.msg} - info: ${Singleton.info()}")
    val companion = Companion()
    println("Companion Object: meta - ${Companion.meta}, info - ${Companion.info()}")
    println("Companion Non Static: info - ${companion.nonStaticInfo()}")
}
