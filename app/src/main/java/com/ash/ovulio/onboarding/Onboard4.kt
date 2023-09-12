package com.ash.ovulio.onboarding

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.ash.ovulio.R
import com.ash.ovulio.login.SignIn

class Onboard4 : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboard4)
        val buttonClick = findViewById<Button>(R.id.nextButton)
        buttonClick.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }

    }
}
