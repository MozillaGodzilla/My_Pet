package com.example.mypet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast

class CleanPet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clean_pet)
    }

    progressbarclean = findViewById(R.id.progressbarclean)
    Clean2 = findViewById(R.id.Clean2)

    Clean2.setOnClickListener {
        if (progressStatus < 100) {
            progressStatus += 10
            progressbarclean.progress = progressStatus
        } else {
            Toast.makeText(this,"Look at me, I'm squeaky clean!", Toast.LENGTH_SHORT).show()
            Handler().postDelayed({
                progressStatus = 0
                progressbarclean.progress = 0
                ,180000)
            }
        }
    }

    var Backclean = findViewById<Button>(R.id.Backclean)
    Backfeed.setOnClickListener {
        val intent = Intent(this, WelcomePet::class.java)
        startActivity(intent)
    }
}
}