package com.hichapp.flipcoin

import android.content.Context
import android.view.View
import android.view.animation.AnimationUtils

fun showNumber(context:Context, view:View){
    val animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
    view.startAnimation(animation)
}