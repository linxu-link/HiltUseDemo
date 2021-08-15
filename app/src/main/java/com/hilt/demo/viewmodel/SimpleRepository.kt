package com.hilt.demo.viewmodel

import javax.inject.Inject

class SimpleRepository @Inject constructor() {

    fun getData() {
        println("getData")
    }
}