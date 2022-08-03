package com.example.camera;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class VideoPlayActivity extends AppCompatActivity {

    private VideoView mVideoVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_play);

        mVideoVideo = findViewById(R.id.videoView);
        Uri videoUri = Uri.parse(getIntent().getExtras().getString("videoUri"));

        mVideoVideo.setVideoURI(videoUri);
        mVideoVideo.start();

    }
}