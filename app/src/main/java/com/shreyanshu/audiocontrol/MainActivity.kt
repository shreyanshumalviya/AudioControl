package com.shreyanshu.audiocontrol

import android.app.Activity
import android.media.AudioManager
import android.os.Bundle

/**
 * Loads [MainFragment].
 */
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val audioManager=applicationContext.getSystemService(AUDIO_SERVICE) as AudioManager
        audioManager.adjustVolume(
            AudioManager.ADJUST_LOWER,
            AudioManager.FLAG_PLAY_SOUND
        )
        MyIntentService.startActionFoo(this,"","")
    }

    override fun onPause() {
        MyIntentService.startActionFoo(this,"","")
        super.onPause()
    }

    override fun onStop() {
        MyIntentService.startActionFoo(this,"","")
        super.onStop()
    }


}
