package com.ash.ovulio.infocollect

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.ash.ovulio.R
import com.ash.ovulio.infocollect.privacy


class privacy : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacy)

        val mButton = findViewById<View>(R.id.privacyScreenButton) as Button
        val mCheckBox = findViewById<CheckBox>(R.id.privacyCheckBox1) as CheckBox
        mCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                mButton.isEnabled = true
                mButton.setOnClickListener{
                    Toast.makeText(this@privacy, "This is the last page! Thank you for viewing", Toast.LENGTH_LONG).show();
                }
            } else {
                mButton.isEnabled = false
            }
        }
    }
}