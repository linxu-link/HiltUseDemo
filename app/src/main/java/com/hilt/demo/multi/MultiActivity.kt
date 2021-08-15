package com.hilt.demo.multi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilt.demo.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MultiActivity : AppCompatActivity() {

    @TargetType1
    @Inject
    lateinit var target4Type1: Target4

    @TargetType2
    @Inject
    lateinit var target4Type2: Target4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi)
        println(target4Type1)
        println(target4Type2)
    }
}