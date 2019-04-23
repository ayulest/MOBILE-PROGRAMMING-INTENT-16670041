package com.ayulest.intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.util.Log
import android.view.View
import android.support.v4.app.ShareCompat
import kotlinx.android.synthetic.main.activity_explisit_intent.*


class ExplisitIntentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explisit_intent)

    }
    fun openWebsite(view: View) {
        // Get the URL text.
        val url = website_edittext.getText().toString()

        // Parse the URI and create the intent.
        val webpage = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)

        // Find an activity to hand the intent and start that activity.
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!")
        }
    }
    fun openLocation(view: View) {
        // Get the string indicating a location. Input is not validated; it is
        // passed to the location handler intact.
        val loc = location_edittext.getText().toString()

        // Parse the location and create the intent.
        val addressUri = Uri.parse("geo:0,0?q=$loc")
        val intent = Intent(Intent.ACTION_VIEW, addressUri)

        // Find an activity to handle the intent, and start that activity.
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!")
        }
    }
    fun shareText(view: View) {
        val txt = share_edittext.getText().toString()
        val mimeType = "text/plain"
        ShareCompat.IntentBuilder
            .from(this)
            .setType(mimeType)
            .setChooserTitle("Share this text with: ")
            .setText(txt)
            .startChooser()
    }
}
