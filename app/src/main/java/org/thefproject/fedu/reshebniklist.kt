package org.thefproject.fedu

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class reshebniklist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reshebniklist)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val profile = findViewById<View>(R.id.profile)
        profile.setOnClickListener {
            val g = Intent(this, profile::class.java)
            startActivity(g)
        }
        val predmet = findViewById<View>(R.id.prdmet)
        profile.setOnClickListener {
            val g = Intent(this, predmets::class.java)
            startActivity(g)
        }
        val gdz = findViewById<View>(R.id.reshebnik)
        profile.setOnClickListener {
            val g = Intent(this, reshebniklist::class.java)
            startActivity(g)
        }
    }
}