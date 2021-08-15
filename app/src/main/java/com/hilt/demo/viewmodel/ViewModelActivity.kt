package com.hilt.demo.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.hilt.demo.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ViewModelActivity : AppCompatActivity() {

    private val viewModel: SimpleViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)
        viewModel.getData()
    }
}