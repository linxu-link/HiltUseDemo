package com.hilt.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.hilt.demo.abs.AbsActivity
import com.hilt.demo.normal.NormalActivity
import com.hilt.demo.provider.ProviderActivity
import com.hilt.demo.viewmodel.ViewModelActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_1).setOnClickListener {
            val intent = Intent(this, NormalActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btn_2).setOnClickListener {
            val intent = Intent(this, ProviderActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btn_3).setOnClickListener {
            val intent = Intent(this, AbsActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btn_4).setOnClickListener {
            val intent = Intent(this, ViewModelActivity::class.java)
            startActivity(intent)
        }
    }
}