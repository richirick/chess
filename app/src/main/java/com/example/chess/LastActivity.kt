package com.example.chess

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class LastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.last_activity)

        val mailLink : TextView = findViewById(R.id.mail_link)
        mailLink.movementMethod= LinkMovementMethod.getInstance()
        mailLink.setLinkTextColor(Color.GREEN)


    }

    fun onClickGoMain7(view: View) {
        val intent = Intent(this, LessonLinks::class.java)
        startActivity(intent)}
}