package com.ash.ovulio.onboarding

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import com.ash.ovulio.R

class OnboardReminder : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboardreminder)
        val buttonClick = findViewById<View>(R.id.nextButton)
        buttonClick.setOnClickListener {
            val intent = Intent(this, OnboardConception::class.java)
            startActivity(intent)
        }

    }
}