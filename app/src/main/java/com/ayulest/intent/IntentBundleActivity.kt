package com.ayulest.intent

import android.graphics.Color
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_intent_bundle.*
import android.content.Intent
import android.content.ActivityNotFoundException
import android.net.Uri


class IntentBundleActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        requestWindowFeature(1);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            );
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        setContentView(R.layout.activity_intent_bundle)
        btnInstagram.setOnClickListener {
            val uri = Uri.parse("http://instagram.com/_u/ayle0699")
            val likeIng = Intent(Intent.ACTION_VIEW, uri)

            likeIng.setPackage("com.instagram.android")

            try {
                startActivity(likeIng)
            } catch (e: ActivityNotFoundException) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://instagram.com/ayle0699")
                    )
                )
            }

        }
        btnYoutube.setOnClickListener {
            val uri = Uri.parse("https://www.youtube.com/channel/UCzgxx_DM2Dcb9Y1spb9mUJA")
            val likeIng = Intent(Intent.ACTION_VIEW, uri)

            likeIng.setPackage("com.google.android.youtube")

            try {
                startActivity(likeIng)
            } catch (e: ActivityNotFoundException) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/channel/UCzgxx_DM2Dcb9Y1spb9mUJA")
                    )
                )
            }

        }
//        val nama = intent.getStringExtra("NAMA")
//        val ttl = intent.getStringExtra("NPM")
//        val alamat = intent.getStringExtra("SEKOLAH")
//        val hobby = intent.getStringExtra("HOBBY")
//        val agama = intent.getStringExtra("AGAMA")
//        val email = intent.getStringExtra("JK")
//
//        tvnama.text = nama
//        tvttl.text = ttl
//        tvalamat.text = alamat
//        tvhobby.text = hobby
//        tvagama.text = agama
//        tvemail.text = email
    }
}