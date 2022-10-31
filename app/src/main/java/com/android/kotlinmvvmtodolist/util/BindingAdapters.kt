package com.android.kotlinmvvmtodolist.util

import android.annotation.SuppressLint
import android.graphics.Color
import android.widget.TextView
import androidx.databinding.BindingAdapter
import java.text.DateFormat
import java.text.SimpleDateFormat

@SuppressLint("SetTextI18n")
@BindingAdapter("setPriority")
fun setPriority(view: TextView, priority: Int){
    when(priority){
        0 -> {
            view.text = "Chưa hoàn thành"
            view.setTextColor(Color.RED)
        }
        1 -> {
            view.text = "Đang làm"
            view.setTextColor(Color.BLUE)
        }
        else -> {
            view.text = "Hoàn thành"
            view.setTextColor(Color.GREEN)
        }
    }
}

@BindingAdapter("setTimestamp")
fun setTimestamp(view: TextView, timestamp: Long){
    val myFormat = "dd/MM/yyyy"
    val sdf = SimpleDateFormat(myFormat)
    view.text = sdf.format(timestamp)
}