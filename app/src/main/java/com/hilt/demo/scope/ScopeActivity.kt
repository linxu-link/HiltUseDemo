package com.hilt.demo.scope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilt.demo.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ScopeActivity : AppCompatActivity() {

    @Inject
    lateinit var target1: Target5

    @Inject
    lateinit var target2: Target5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scope)
        println(target1)
        println(target2)
    }
}