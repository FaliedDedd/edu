package org.thefproject.fedu

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class reshebnik10th : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reshebnik10th)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val predmets = findViewById<View>(R.id.prdmet)
        predmets.setOnClickListener {
            val g = Intent(this, books10th::class.java)
            startActivity(g)
        }
        val reshebnik10 = findViewById<View>(R.id.reshebnik)

        reshebnik10.setOnClickListener {
            val g = Intent(this, reshebnik10::class.java)
            startActivity(g)
        }
    }
    }
