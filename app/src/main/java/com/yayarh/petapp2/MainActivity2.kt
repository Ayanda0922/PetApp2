package com.yayarh.petapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val petImageView: ImageView = findViewById(R.id.petImage)
        val feedButton: Button = findViewById(R.id.feedButton)
        val playButton: Button = findViewById(R.id.playButton)
        val cleanButton: Button = findViewById(R.id.cleanButton)

        feedButton.setOnClickListener {
            //change pet image for feeding action
            petImageView.setImageResource(R.drawable.feeding_image)
            //update pet status values
            //Your logic here
            cleanButton.setOnClickListener {
                //change pet image for cleaning action
                petImageView.setImageResource(R.drawable.clean_image)
                //update pet status values
                //your logic here

                playButton.setOnClickListener {
                    //change pet image for playing action
                    petImageView.setImageResource(R.drawable.play_image)
                    //update pet status values
                    //your logic here
                }
            }

            }
        }


















}
