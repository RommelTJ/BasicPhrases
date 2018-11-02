package com.rommelrico.basicphrases

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    fun playPhrase(view: View) {
        val buttonPressed = view as Button
        val mediaPlayer = MediaPlayer.create(this, resources.getIdentifier(buttonPressed.tag.toString(), "raw", packageName))
        mediaPlayer.start()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
