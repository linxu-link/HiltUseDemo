package com.hilt.demo.abs

class ISimpleImpl : ISimple {

    override fun print(string: String) {
        println(this::class.simpleName + ";" + string)
    }

}