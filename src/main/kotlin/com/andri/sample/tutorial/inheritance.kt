package com.andri.sample.tutorial

// Open class
open class Human(var firstName: String, var lastName: String, var age: Int){
    fun fullname() = "$firstName $lastName"
    open fun work() = "Human is working"
}

class Employee(firstName: String, lastName: String, age: Int = 18, var company: String, var email: String) :
        Human( firstName, lastName, age) {
    override fun work() = "Employee ${this.firstName} is working"
}

// Abstract class
abstract class AbstractPerson(name: String, var address: String) {
    var name = name
    fun sayHello() = "Hello $name at $address"
    abstract fun work(hour: Float):String
}

class ConcretePerson(name: String, address: String, var age: Int) : AbstractPerson(name, address){
    override fun work(hour: Float) = "${this.name} already works for $age hours"
}

// Interface
interface AnimalBase {

    val MAX_AGE: Int
    val MAX_SPEED: Int
        get() = 100

    fun makeSound(): String

    fun doMove(): String
}

class Dog(var name: String) : AnimalBase {

    override val MAX_AGE: Int = 5

    override fun doMove() = "Run"

    override fun makeSound() = "Bark"
}

interface RobotBase {
    fun ability() : String
}

class DogCyborg : AnimalBase, RobotBase {

    var name: String? = null

    constructor(name: String){
        this.name = name
    }

    override val MAX_AGE: Int = 100

    override val MAX_SPEED: Int = 500

    override fun doMove() = "Run"

    override fun makeSound() = "Bark"

    override fun ability() = "Flying"

    fun fullname(): String? = this.name
}

open class View {

    var width: Double = 0.0
    var height: Double = 0.0

    constructor(width: Double){
        this.width = width
    }

    constructor(width: Double, height: Double){
        this.width = width
        this.height = height
    }

    open fun wide(): Double = 0.0
}

class RectangleView : View {

    constructor(width: Double) : super(width)

    constructor(width: Double, height: Double) : super(width, height)

    override fun wide() = this.height * this.width
}

fun main(args: Array<String>) {
    val employee = Employee(firstName = "John", lastName = "Square", email = "jsquare@acme.com", company = "Acme Ltd")

    println("Employee: ${employee.fullname()} is ${employee.age} and works at ${employee.company}, " +
            "Email: ${employee.email}")

    println("Working: ${employee.work()}")

    val person = ConcretePerson("James.P", "Birmingham", 3)
    person.name = "James Burton"
    println("ConcretePerson : ${person.sayHello()}")
    println("def : ${person.work(1.5f)}")

    val dog = Dog("Barnie")
    dog.name = "Barnie.J"
    println("Dog ${dog.name}, ${dog.MAX_AGE} years old ${dog.makeSound()} and ${dog.doMove()} for ${dog.MAX_SPEED} km/hour")

    val dogRobot = DogCyborg("Frank")
    println("DogCyborg ${dogRobot.fullname()}, ${dogRobot.MAX_AGE} years old, ${dogRobot.makeSound()} " +
            "and ${dogRobot.doMove()} for ${dogRobot.MAX_SPEED} km/hour")

    val rectangle = RectangleView(2.5, 3.0)
    println("Rectangle wide ${rectangle.wide()}")
}
