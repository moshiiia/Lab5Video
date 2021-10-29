package com.example.lab5video

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.MediaController
import android.widget.VideoView




class MainActivity : AppCompatActivity() {
    private var myvideoPlayer: VideoView? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myvideoPlayer = findViewById<VideoView>(R.id.videoView)
        val myVideoUri: Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.pippop)
        myvideoPlayer!!.setVideoURI(myVideoUri)
        val mediaController = MediaController(this)
        myvideoPlayer!!.setMediaController(mediaController)
        mediaController.setMediaPlayer(myvideoPlayer)


    }

    fun onPlayClick(v: View?) {
        myvideoPlayer!!.start();
    }

    fun onPauseClick(v: View?) {
        myvideoPlayer!!.pause();
    }

    fun onStopClick(v: View?) {
        myvideoPlayer!!.resume();
    }
}