package com.example.androidappfour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.view.View

class MainActivity : AppCompatActivity() {
    var ivPreview: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ivPreview = findViewById(R.id.ivPreview) as ImageView
    }

    fun changeImage(v: View) {
        when (v.id) {
            R.id.iv_thoma -> ivPreview?.setBackgroundResource(R.drawable.thoma)
            R.id.iv_xiao -> ivPreview?.setBackgroundResource(R.drawable.xiao)
            R.id.iv_hutao -> ivPreview?.setBackgroundResource(R.drawable.hutao)
        }
    }
}