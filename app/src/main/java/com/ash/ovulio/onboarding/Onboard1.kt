package com.ash.ovulio.onboarding

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.ash.ovulio.R

class Onboard1 : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboard1)
        val buttonClick = findViewById<Button>(R.id.nextButton)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Onboard2::class.java)
            startActivity(intent)
        }

    }

}