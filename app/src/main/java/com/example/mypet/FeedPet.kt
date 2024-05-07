package com.example.mypet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast

class FeedPet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed_pet)

    }

    progressbarfeed = findViewById(R.id.progressbarfeed)
    Feed2 = findViewById(R.id.Feed2)

    Feed2.setOnClickListener {
        if (progressStatus < 100) {
            progressStatus += 10
            progressbarfeed.progress = progressStatus
        } else {
            Toast.makeText(this,"Pet Fed! Yippy Yay!", Toast.LENGTH_SHORT).show()
            Handler().postDelayed({
                progressStatus = 0
                progressbarfeed.progress = 0
                ,180000)
            }
        }
    }

    var Backfeed = findViewById<Button>(R.id.Backfeed)
    Backfeed.setOnClickListener {
        val intent = Intent(this, WelcomePet::class.java)
        startActivity(intent)
    }
}

}