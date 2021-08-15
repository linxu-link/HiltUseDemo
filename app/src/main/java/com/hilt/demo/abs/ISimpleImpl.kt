package com.hilt.demo.abs

import javax.inject.Inject

class ISimpleImpl @Inject constructor() : ISimple {

    override fun print(string: String) {
        println(this::class.simpleName + ";" + string)
    }

}