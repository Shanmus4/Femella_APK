package com.ash.ovulio.onboarding

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import com.ash.ovulio.R

class OnboardReprod : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboardreprod)
        val buttonClick = findViewById<View>(R.id.nextButton)
        buttonClick.setOnClickListener {
            val intent = Intent(this, OnboardReminder::class.java)
            startActivity(intent)
        }

    }

}