package com.ayulest.intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_bundle.*

class IntentBundleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_bundle)

        val nama = intent.getStringExtra("Nama")
        val ttl = intent.getStringExtra("TTL")
        val alamat = intent.getStringExtra("Alamat")
        val hobby = intent.getStringExtra(" Hobby")
        val agama = intent.getStringExtra("Agama")
        val email = intent.getStringExtra("Email")

        tvnama.text = nama
        tvttl.text = ttl
        tvalamat.text = alamat
        tvhobby.text = hobby
        tvagama.text = agama
        tvemail.text = email



    }
}
