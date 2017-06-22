package com.andri.sample.tutorial

fun main (params : Array<String>?) {

    // :: Array ::
    val days = arrayOf("Mon", "Tue", "Wed", "Th", "Fri", "Sat", "Sun")
    // Return the value of the first element in the array.
    days[0]
    println("day[0] " + days[0])

    // Change an element in the array.
    days[3] = "Thur"
    // Get a existing element from the array.
    days[3]
    println("day[3] " + days[3])

    // Get the total number of elements in the array.
    println("day.size " + days.size)

    // :: List ::
    val dayList: List<String> = days.toList()
    println("day list " + dayList)

    // Create a immutable list (List).
    val fruits = listOf("Banana", "Kiwifruit", "Mango", "Apple")
    //fruits[0] = "test" // can be modified

    val fruitMutable : MutableList<String> = fruits.toMutableList()
    fruitMutable[0] = "Banana green"
    fruitMutable.add("Mellon")
    fruitMutable.removeAt(1)
    println("fruits mutable " + fruitMutable.toString())
    var n = 1
    for (fruit in fruitMutable) {
        println("fruit - ${n} " + fruit)
        n++
    }

    // :: Set ::
    // Like a list except every element has to be unique,
    val animals: Set<String> = setOf("Lion", "Dog", "Cat", "Python", "Lion", "Hippo")
    println("animal " + animals)

    val animalsMutable = animals.toMutableSet()
    animalsMutable.add("Fish")
    animalsMutable.remove("dog")
    animalsMutable.remove("Lion")
    println("animal mutable " + animalsMutable)

    // :: Map ::
    // Create a mutable map (MutableMap)
    val nzPop = mutableMapOf("AUCK" to 1500000, "WLG" to 405000, "CHCH" to 500000, "GIS" to 36100)
    println("nzPop " + nzPop)
    // Change a existing entry in the map.
    nzPop["CHCH"] = 389700
    println("nzPop " + nzPop)

    // Remove a entry from the map by key.
    nzPop.remove("GIS")
    println("nzPop " + nzPop)
    // Add a entry to the map.
    nzPop["DUN"] = 118500
    println("nzPop " + nzPop)

    nzPop.put("TAM", 12)
    println("nzPop " + nzPop)
    println("contains key " + nzPop.containsKey("TAM") )
    println("contains key " + nzPop.containsKey("TAm") )
    for (key in nzPop.keys){
        println("element[${key}] " + nzPop.get(key = key) )
    }

    nzPop.clear()
    println("nzPop after clear" + nzPop)

    val emptyMap = emptyMap<String, Int>()
    println("empty map "+ emptyMap)
}
