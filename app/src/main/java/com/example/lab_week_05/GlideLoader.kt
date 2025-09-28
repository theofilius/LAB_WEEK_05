package com.example.lab_week_05

import android.widget.ImageView
import com.bumptech.glide.Glide

class GlideLoader : ImageLoader {
    override fun loadImage(imageUrl: String, imageView: ImageView) {
        Glide.with(imageView.context)
            .load(imageUrl)
            .centerCrop()
            .into(imageView)
    }
}
