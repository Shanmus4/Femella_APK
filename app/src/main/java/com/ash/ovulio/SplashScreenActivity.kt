package com.ash.ovulio

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity

class SplashScreenActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        val splashlogo = findViewById<ImageView>(R.id.splashlogo)
        splashlogo.alpha = 0f
        splashlogo.animate().setDuration(1500).alpha(1f).withEndAction{
            val splashtransition = Intent(this, Onboard1::class.java)
            startActivity(splashtransition)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
    }
}

