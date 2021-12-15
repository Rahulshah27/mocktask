package com.example.mocktask.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.mocktask.R
import com.example.mocktask.model.NotificationModel


class NotificationAdapter(private val notifications: List<NotificationModel>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    inner class HeaderVH(view: View) :
        RecyclerView.ViewHolder((view)) {

        private val headerTitle = view.findViewById<TextView>(R.id.tv_head)
        fun bind(notifications: NotificationModel) {
            headerTitle.text = notifications.nTitle

        }
    }


    inner class NotificationVH(view: View) :
        RecyclerView.ViewHolder((view)) {

        private val ivImg = view.findViewById<ImageView>(R.id.iv_img)
        private val tvTitle = view.findViewById<TextView>(R.id.tv_title)
        private val tvDetails = view.findViewById<TextView>(R.id.tv_details)
        private  val tvTime = view.findViewById<TextView>(R.id.tv_time)

        fun bind(notifications: NotificationModel) {
            ivImg.setImageResource(notifications.nImg!!)
            tvTitle.text = notifications.nTitle
            tvDetails.text = notifications.nDetail
            tvTime.text = notifications.nTime


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == 1) {
            HeaderVH(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.list_header, parent, false)
            )
        } else {
            NotificationVH(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.list_notification, parent, false)
            )
        }
    }


    override fun getItemCount() = notifications.size

    override fun getItemViewType(position: Int) = notifications?.get(position)?.type!!

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is HeaderVH -> holder.bind(notifications?.get(position))
            is NotificationVH -> holder.bind(notifications?.get(position))
        }
    }
}


