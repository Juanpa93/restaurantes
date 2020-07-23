package com.example.misrestaurantes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    bt_principal.setOnClickListener {
        startActivity(Intent(this, Maps1Activity::class.java))
    }
        bt_niquia.setOnClickListener {
            startActivity(Intent(this, Maps2Activity::class.java))
        }
        bt_envigado.setOnClickListener {
            startActivity(Intent(this, Maps3Activity::class.java))
        }
        bt_itagui.setOnClickListener {
            startActivity(Intent(this, Maps4Activity::class.java))
        }
    }
}