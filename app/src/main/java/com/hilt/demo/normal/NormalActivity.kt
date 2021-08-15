package com.hilt.demo.normal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilt.demo.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class NormalActivity : AppCompatActivity() {

    @Inject
    lateinit var target: Target

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normal)
        println(target.print())
    }
}