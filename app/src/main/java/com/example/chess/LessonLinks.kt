package com.example.chess

//import android.content.Intent
//import android.content.Intent.*
//import android.net.Uri
import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

//import android.widget.Button

class LessonLinks : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lesson_links)
    }

    fun onClickGoMain1(view: View) {
        val lessonLinks : Button=findViewById(R.id.lesson_btn1)
        lessonLinks.setOnClickListener {
            val openURL1 = Intent(ACTION_VIEW)
            openURL1.data=
                Uri.parse("https://www.youtube.com/watch?v=JorvZnyHe6A&ab_channel=ChessSemenov")
            startActivity(openURL1)
        }
    }
    fun onClickGoMain2(view: View) {
        val lessonLinks : Button=findViewById(R.id.lesson_btn2)
        lessonLinks.setOnClickListener {
            val openURL2 = Intent(ACTION_VIEW)
            openURL2.data=
                Uri.parse("https://www.youtube.com/watch?v=o-ZyiU1d0uQ&ab_channel=Valbdemar")
            startActivity(openURL2)
        }
    }
    fun onClickGoMain3(view: View) {
        val lessonLinks : Button=findViewById(R.id.lesson_btn3)
        lessonLinks.setOnClickListener {
            val openURL3 = Intent(ACTION_VIEW)
            openURL3.data=
                Uri.parse("https://youtu.be/hviFNzPmZvY")
            startActivity(openURL3)
        }
    }
    fun onClickGoMain4(view: View) {
        val lessonLinks : Button=findViewById(R.id.lesson_btn4)
        lessonLinks.setOnClickListener {
            val openURL4 = Intent(ACTION_VIEW)
            openURL4.data=
                Uri.parse("https://youtu.be/_Getwc8_CpM")
            startActivity(openURL4)
        }
    }
    fun onClickGoMain5(view: View) {
        val lessonLinks : Button=findViewById(R.id.lesson_btn5)
        lessonLinks.setOnClickListener {
            val openURL5 = Intent(ACTION_VIEW)
            openURL5.data=
                Uri.parse("https://youtu.be/1ZErbuUKiSM")
            startActivity(openURL5)
        }
    }

    fun onClickGoMain6(view: View) {
        val intent = Intent(this, LastActivity::class.java)
        startActivity(intent)
    }

}

