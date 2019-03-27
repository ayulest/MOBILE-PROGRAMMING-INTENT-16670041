package com.ayulest.intent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPindahAcrivityExplisit.setOnClickListener {
          startActivity(Intent(this,ExplisitIntentActivity::class.java))
        }
        btnPindahAcrivityImplisit.setOnClickListener {
            startActivity(Intent(this,ImplisitIntentActivity::class.java))
        }
    }
}
