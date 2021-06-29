package com.liufuyi.channelapk

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mcxiaoke.packer.helper.PackerNg


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val channelIdTextView:TextView = findViewById(R.id.channelIdTextView)

        val channel = PackerNg.getChannel(applicationContext)

        channelIdTextView.text = channel;

    }
}