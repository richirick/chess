package com.example.chess

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

        fun onClickGoMain(view: View) {
            val intent = Intent(this, LessonLinks::class.java)
            startActivity(intent)
//    fun onClickGoMain(view: View) {
//     val imageButton = findViewById<View>(R.id.next_button1) as ImageButton

        }



}

//        final Button button = findViewById(R.id.next_button1);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//        }
//    });
