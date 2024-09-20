

// Copyrigt The F Project 2024



package org.thefproject.fedu

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable
import org.thefproject.fedu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var binding: ActivityMainBinding
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
val LottieAnimationView = findViewById<View>(R.id.LottiAnim)
        val loginin = findViewById<View>(R.id.loginin)

        loginin.setOnClickListener {
            val g = Intent(this, profile::class.java)
            startActivity(g)
binding.apply {
LottiAnim.setMinProgress(0.0f)
    LottiAnim.setMaxProgress(1.0f)
    LottiAnim.repeatCount = 10
    LottiAnim.repeatMode = LottieDrawable.RESTART
    LottiAnim.playAnimation()


}
        }
    }
}
