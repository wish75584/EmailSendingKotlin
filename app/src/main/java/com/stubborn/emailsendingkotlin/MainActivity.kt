package com.stubborn.emailsendingkotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val text: String = "Hello from Kotlin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendEmail(view: View?) {
        val mailId = "yourmail@gmail.com"
        val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", mailId, null))
        emailIntent . putExtra (Intent.EXTRA_SUBJECT, "Subject here")
        emailIntent.putExtra(Intent.EXTRA_TEXT, text)
        startActivity(Intent.createChooser(emailIntent, "Send email..."))
    }

}
