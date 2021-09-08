package com.iotric.videostreaming

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.iotric.videostreaming.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var vedioUri: Uri
    lateinit var vedioView: VideoView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initview()
    }

    private fun initview() {
        val mediaController = MediaController(this)
        vedioView = binding.videoView
        mediaController.setAnchorView(vedioView)
        vedioView.setMediaController(mediaController)
        vedioUri =
            Uri.parse("https://firebasestorage.googleapis.com/v0/b/videostreaming-789d3.appspot.com/o/WhatsApp%20Video%202021-08-03%20at%2022.57.32.mp4?alt=media&token=7578311f-63e0-4518-afe5-de06b4203826")
        vedioView.setVideoURI(vedioUri)
        vedioView.requestFocus()
        vedioView.start()
    }
}