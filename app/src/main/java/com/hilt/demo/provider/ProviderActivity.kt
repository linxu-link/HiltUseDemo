package com.hilt.demo.provider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilt.demo.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ProviderActivity : AppCompatActivity() {

    @Inject
    lateinit var target2: Target2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_provider)
        target2.print()
    }
}