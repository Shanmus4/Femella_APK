package com.ash.ovulio.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.ash.ovulio.R
import com.ash.ovulio.infocollect.privacy

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
            if (passwordText.text.toString().equals("pass")){
                // show next page event
                val buttonClick = findViewById<Button>(R.id.SignInButton)
                buttonClick.setOnClickListener {
                    Toast.makeText(this@SignIn, "Hi " + emailText.text.toString(), Toast.LENGTH_LONG).show();
                    val intent = Intent(this, privacy::class.java)
                    startActivity(intent)
            }}
            else{
                // show error message
                errorMessage.visibility = View.VISIBLE
                errorMessage.text = getString(R.string.password_error)

            }
        }


    }
}