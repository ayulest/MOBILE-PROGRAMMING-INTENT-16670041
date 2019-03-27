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
        btnPindahAcrivityIntentBundle.setOnClickListener {
            val intent:Intent =Intent(this, IntentBundleActivity::class.java)
            intent.putExtra("NAMA", "Ayu")
            intent.putExtra("NPM", "16670041")
            intent.putExtra("SEKOLAH", "Universitas PGRI Semarang")
            intent.putExtra("FOTO_URL", "https://cdnx.kincir.com/production/media/2018/november/5-webtoon-yang-ditunggu-adaptasi-serial-dramanya/1-judul-webtoon-yang-ditunggu-adaptasi-serial-dramanya.jpg")
            intent.putExtra("FOTO", android.R.drawable.alert_light_frame)
            intent.putExtra("JK", "Girls")
            startActivity(intent)

        }
    }
}
