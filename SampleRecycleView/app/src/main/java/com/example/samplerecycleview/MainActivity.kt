package com.example.samplerecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<News> //contains the news items
    lateinit var imageId:Array<Int>
    lateinit var heading:Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image8,
            R.drawable.image9,
            R.drawable.image10
        )

        heading = arrayOf(
            "I am strong.",
            "I believe in myself.",
            "Each day is a new opportunity to grow and be a better version of myself.",
            "Every challeng",
            "I have so much to be grateful for.",
            "Good things are",
            "New opportunities await me at every turn.",
            "R.drawable.image8",
            "R.drawable.image9",
            "R.drawable.image10"
        )

        newRecyclerView = findViewById (R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        getUserData()
    }

    private fun getUserData() {

        for (i in imageId.indices){
            val news = News (imageId[i], heading[i])
            newArrayList.add(news)
        }

        newRecyclerView.adapter = Adapter(newArrayList)
    }
}