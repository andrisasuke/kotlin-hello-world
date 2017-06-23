package com.andri.sample.tutorial

import com.andri.sample.util.randomNumber
import com.andri.sample.util.MAX_NUM

fun main (params: Array<String>) {

    // importing everything can use `import com.andri.sample.util.*`
    val param = MAX_NUM
    println("accessing importing var $param")
    val num = randomNumber()
    println("randomNumber $num")
}
