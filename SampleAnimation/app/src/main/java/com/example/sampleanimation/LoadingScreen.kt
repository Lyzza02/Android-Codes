package com.example.sampleanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.airbnb.lottie.LottieAnimationView

class LoadingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading_screen)

        val bg = findViewById<ImageView>(R.id.bg)
        val logo = findViewById<ImageView>(R.id.logo)
        val name = findViewById<ImageView>(R.id.name)
        val animate = findViewById<LottieAnimationView>(R.id.animate)


        bg.animate().translationY(-3300f).setDuration(1000).setStartDelay(4000)
        logo.animate().translationY(2200f).setDuration(1000).setStartDelay(4000)
        name.animate().translationY(2200f).setDuration(1000).setStartDelay(4000)
        animate.animate().translationY(2200f).setDuration(1000).setStartDelay(4000)
    }
}