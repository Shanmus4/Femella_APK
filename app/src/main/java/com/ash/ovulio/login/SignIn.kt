package com.ash.ovulio.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.compose.ui.graphics.Color
import androidx.core.content.ContextCompat
import com.ash.ovulio.R

class SignIn : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val emailText = findViewById<EditText>(R.id.EmailText)
        val passwordText = findViewById<EditText>(R.id.PasswordText)
        var signInButton = findViewById<Button>(R.id.SignInButton)
        val errorMessage = findViewById<TextView>(R.id.ErrorMessage)

//        if (emailText.text.toString().trim().isEmpty() || passwordText.text.trim().isEmpty()){
//            signInButton.isEnabled = false
//        }
//

        signInButton.setOnClickListener{
            if (emailText.text.toString().equals("User", true) && passwordText.text.toString().equals("pass", ignoreCase = true)){
                // show next page event
                errorMessage.visibility = View.VISIBLE
                errorMessage.text = "Correct!!"
            }
            else{
                // show error message

                errorMessage.visibility = View.VISIBLE
                errorMessage.text = "Incorrect"

            }
        }


    }
}