package com.andri.sample.tutorial

class Foo(val id: String) {

    init {
        println("init foo: $id")
    }

    fun print(): String = "id : ${this.id}"

}

class Bar {

    val foo1: Foo by lazy { Foo("lazy") }
    lateinit var foo2: Foo

    fun startBar(){
        foo2 = Foo("lateinit")
        println("startBar()")
        println("foo1 ${foo1.print()}")
        println("foo2 ${foo2.print()}")

    }
}



fun main(args: Array<String>) {
    Bar().startBar()
}
