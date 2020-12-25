package com.hichapp.flipcoin

import java.util.*

fun getRandomNumber() : Int {
    val random = Random()
    return random.nextInt(50)
}