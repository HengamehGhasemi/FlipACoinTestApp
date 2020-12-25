package com.hichapp.flipcoin

import android.view.View

fun flip(image : View)  {
    image.animate().apply {
        duration = 500
        rotationYBy(180f)
    }
}