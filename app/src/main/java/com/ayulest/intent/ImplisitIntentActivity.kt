package com.ayulest.intent

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.support.v4.app.ShareCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_explisit_intent.*
import kotlinx.android.synthetic.main.activity_implisit_intent.*


class ImplisitIntentActivity : AppCompatActivity() {
    val REQUEST_IMAGE_CAPTURE =0
    private val TAKE_PICTURE = 1
    private var imageUri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implisit_intent)

        btnCapture.setOnClickListener {
            dispatchTakePictureIntent()
        }
        }

    fun dispatchTakePictureIntent() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            takePictureIntent.resolveActivity(packageManager)?.also {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)

            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
      if(requestCode== REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK){
          val imageBitmap = data?.extras?.get("data") as Bitmap
          iv.setImageBitmap(imageBitmap)
      }
    }
    fun shareImage(view: View) {
        val txt = share_image_button.getText().toString()
        val mimeType = "text/plain"
        ShareCompat.IntentBuilder
            .from(this)
            .setType(mimeType)
            .setChooserTitle("Share this image with: ")
            .setText(txt)
            .startChooser()
    }
}
