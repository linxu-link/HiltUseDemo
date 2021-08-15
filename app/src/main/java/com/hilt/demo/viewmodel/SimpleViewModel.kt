package com.hilt.demo.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SimpleViewModel @Inject constructor(
    val repository: SimpleRepository
) : ViewModel() {

    fun getData() {
        repository.getData()
    }

}