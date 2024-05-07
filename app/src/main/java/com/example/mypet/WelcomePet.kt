package com.example.mypet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.ViewCompat


class WelcomePet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_pet)


    }

    var Feed = findViewById<Button>(R.id.Feed).setOnClickListener {
        val intent =  Intent(this, FeedPet::class.java)
        startActivity(intent)
    }


    var Clean = findViewById<Button>(R.id.Clean).setOnClickListener {
        val intent = Intent(this, CleanPet::class.java)
        startActivity(intent)
    }

    var Play = findViewById<Button>(R.id.Play).setOnClickListener {
        val intent = Intent(this, PlayPet::class.java)
        startActivity(intent)
    }


    }
}
