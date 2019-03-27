package com.ayulest.intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_bundle.*

class IntentBundleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_bundle)

        val nama = intent.getStringExtra("NAMA")
        val npm = intent.getStringExtra("NPM")
        val sekolah = intent.getStringExtra("SEKOLAH")
        val foto_url = intent.getStringExtra("FOTO_URL")
        val foto = intent.getStringExtra("FOTO")
        val jk = intent.getStringExtra("JK")

        tvNama.text = nama
        tvNpm.text = npm
        tvSekolah.text = sekolah
        tvJk.text = jk


    }
}
