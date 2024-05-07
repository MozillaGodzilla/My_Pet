package com.example.mypet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast

class PlayPet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_pet)
    }

    progressbarplay = findViewById(R.id.progressbarplay)
    Play2 = findViewById(R.id.Play2)

    Play2.setOnClickListener {
        if (progressStatus < 100) {
            progressStatus += 10
            progressbarplay.progress = progressStatus
        } else {
            Toast.makeText(this,"Thanks for playing with me I had fun!", Toast.LENGTH_SHORT).show()
            Handler().postDelayed({
                progressStatus = 0
                progressbarplay.progress = 0
                ,180000)
            }
        }
    }

    var Backplay = findViewById<Button>(R.id.Backplay)
    Backplay.setOnClickListener {
        val intent = Intent(this, WelcomePet::class.java)
        startActivity(intent)
    }
}
}