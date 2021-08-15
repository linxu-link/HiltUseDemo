package com.hilt.demo.normal

import javax.inject.Inject


class Target @Inject constructor() {

    fun print() {
        println(this.javaClass.simpleName)
    }
}