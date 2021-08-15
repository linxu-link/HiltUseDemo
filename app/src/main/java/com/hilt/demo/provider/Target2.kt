package com.hilt.demo.provider

import android.app.Activity
import android.content.Context

class Target2 constructor(
    val context: Context,
    val activity: Activity,
    val target: Target3
) {

    fun print() {
        println(this.javaClass.simpleName + "\n" + context + "\n" + activity + "\n")
        target.print()
    }
}