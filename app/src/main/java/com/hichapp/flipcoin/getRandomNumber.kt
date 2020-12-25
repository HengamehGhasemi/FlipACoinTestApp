package com.hichapp.flipcoin

import java.util.*

fun getRandomNumber() : Int {
    val max = 50
    val min = 1
    val random = Random()
    return random.nextInt((max - min) + 1) + min
}