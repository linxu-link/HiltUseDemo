package com.hilt.demo.abs

import javax.inject.Inject

class AbsSimpleImpl @Inject constructor() : AbsSimple() {

    override fun print(string: String) {
        println(this::class.simpleName + ";" + string)
    }

}