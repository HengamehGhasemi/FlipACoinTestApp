package com.hichapp.flipcoin

import androidx.constraintlayout.motion.widget.MotionLayout

fun disposeNumber(motionLayout: MotionLayout){
    motionLayout.transitionToStart()
    motionLayout.transitionToEnd()
}