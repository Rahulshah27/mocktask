package com.example.mocktask.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mocktask.R
import com.example.mocktask.model.NotificationModel

class NotificationEarlierAdapter(private val notifications: List<NotificationModel>):
RecyclerView.Adapter<NotificationEarlierAdapter.NotificationEarlierVH>()  {
    inner class NotificationEarlierVH(view: View): RecyclerView.ViewHolder(view) {

        private val ivImg = view.findViewById<ImageView>(R.id.iv_img)
        private val tvTitle = view.findViewById<TextView>(R.id.tv_title)
        private val tvDetails = view.findViewById<TextView>(R.id.tv_details)
        private  val tvTime = view.findViewById<TextView>(R.id.tv_time)

        fun bind(notifications: NotificationModel) {
            ivImg.setImageResource(notifications.nImg)
            tvTitle.text = notifications.nTitle
            tvDetails.text = notifications.nDetail
            tvTime.text = notifications.nTime
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationEarlierVH {
        return NotificationEarlierVH(LayoutInflater.from(parent.context).inflate(R.layout.list_earlier_notification, parent, false))
    }

    override fun onBindViewHolder(holder: NotificationEarlierVH, position: Int) {
        holder.bind(notifications[position])
    }

    override fun getItemCount() = notifications.size
}