package com.hilt.demo.abs

class AbsSimpleImpl : AbsSimple() {

    override fun print(string: String) {
        println(this::class.simpleName + ";" + string)
    }

}