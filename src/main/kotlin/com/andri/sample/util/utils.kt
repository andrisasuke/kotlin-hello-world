package com.andri.sample.util

import java.util.Random

// default identifier is public
public val MAX_NUM = 200

fun randomNumber() = Random().nextInt(MAX_NUM)
