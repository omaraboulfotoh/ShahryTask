package com.example.shahrytask.utils

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.shahrytask.R
import com.example.shahrytask.utils.views.CircleTransform
import com.squareup.picasso.Picasso


@BindingAdapter("imageUrl")
fun ImageView.loadImage(imageUrl: String?) {

    if (!imageUrl.isNullOrEmpty())
        Picasso.get()
            .load(
                imageUrl
            )
            .placeholder(R.color.light_grey)
            .into(this)
    else
        setImageResource(R.color.light_grey)

}

@BindingAdapter("imageCompleteUrl")
fun ImageView.loadImageFromUrl(imageUrl: String?) {
    if (!imageUrl.isNullOrEmpty())
        Picasso.get()
            .load(imageUrl)
            .placeholder(R.color.light_grey)
            .into(this)

}

@BindingAdapter("imageUrlCircle")
fun ImageView.loadCircleImage(imageUrl: String?) {
    if (!imageUrl.isNullOrEmpty())
        Picasso.get()
            .load(imageUrl)
            .placeholder(R.drawable.shape_circle_grey)
            .transform(CircleTransform())
            .into(this)
}

@BindingAdapter("imageUrlRounded")
fun ImageView.loadRoundImage(imageUrl: String?) {
    if (!imageUrl.isNullOrEmpty())
        Picasso.get()
            .load(imageUrl)
            .placeholder(R.color.light_grey)
            .transform(RoundedCornersTransformation(35, 0))
            .into(this)
}

@BindingAdapter("imageCompleteUrlRounded")
fun ImageView.loadRoundCompleteImage(imageUrl: String?) {
    if (!imageUrl.isNullOrEmpty())
        Picasso.get()
            .load(imageUrl)
            .placeholder(R.color.light_grey)
            .transform(RoundedCornersTransformation(35, 0))
            .into(this)
}

@BindingAdapter("imageCompleteUrlCircle")
fun ImageView.loadCircleImageFromUrl(imageUrl: String?) {
    if (!imageUrl.isNullOrEmpty())
        Picasso.get()
            .load(imageUrl)
            .placeholder(R.drawable.shape_circle_grey)
            .transform(CircleTransform())
            .into(this)
}

@BindingAdapter("imageSrc")
fun ImageView.loadImage(imageSrc: Int) {
    if (imageSrc != -1)
        this.setImageResource(imageSrc)

}

@BindingAdapter("textSrc")
fun TextView.loadText(textSrc: Int) {
    if (textSrc != -1)
        this.setText(textSrc)
}

@BindingAdapter("textColorSrc")
fun TextView.setTextColor(textColor: String?) {
    if (textColor != null)
        this.setTextColor(Color.parseColor(textColor))
}

@BindingAdapter("viewColorSrc")
fun ImageView.setTintColor(textColor: String?) {
    if (textColor != null)
        this.setColorFilter(Color.parseColor(textColor))
}

@BindingAdapter("setBackgroundSrc")
fun View.setBackground(backgroundSrc: Int) {
    if (backgroundSrc != -1)
        this.setBackgroundResource(backgroundSrc)
}

@BindingAdapter("setBackgroundColor")
fun View.setBackgroundColor(bgColor: String?) {
    if (bgColor != null)
        this.setBackgroundColor(Color.parseColor(bgColor))
}
