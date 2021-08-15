package com.hilt.demo.abs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilt.demo.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AbsActivity : AppCompatActivity() {

    @Inject
    lateinit var simple: ISimple
    @Inject
    lateinit var absSimple: AbsSimple

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abs)
        simple.print("ISimple!!")
        absSimple.print("AbsSimple!!")
    }
}