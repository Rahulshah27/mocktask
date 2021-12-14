package com.example.mocktask.presentation.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mocktask.R
import com.example.mocktask.databinding.NotificationFragmentBinding
import com.example.mocktask.model.NotificationModel
import com.example.mocktask.presentation.adapter.NotificationAdapter
import com.example.mocktask.presentation.adapter.NotificationEarlierAdapter

class NotificationFragment: Fragment(R.layout.notification_fragment) {

    private var notificationAdapter = NotificationAdapter(
        listOf(
            NotificationModel(R.drawable.img, "Next Module awaits!", "it has been 2 weeks since you finshed your previous work!", "12 Minutes ago"),
        )
    )

    private var notificationAdapterEarlier = NotificationEarlierAdapter(
        listOf(
            NotificationModel(R.drawable.img, "Next Module awaits!", "it has been 2 weeks since you finshed your previous work!", "12 Minutes ago"),
            NotificationModel(R.drawable.img, "Next Module awaits! 2", "it has been months since you finshed your previous work!", "30 Minutes ago"),
            NotificationModel(R.drawable.img, "Next Module awaits!", "it has been 2 weeks since you finshed your previous work!", "12 Minutes ago"),
            NotificationModel(R.drawable.img, "Next Module awaits! 2", "it has been months since you finshed your previous work!", "30 Minutes ago")
        )
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = NotificationFragmentBinding.bind(view)

        binding.rvEarlier.isNestedScrollingEnabled = false
        binding.rvNew.isNestedScrollingEnabled = false

        binding.rvNew.adapter = notificationAdapter
        binding.rvEarlier.adapter = notificationAdapterEarlier
        binding.rvNew.layoutManager = LinearLayoutManager(this.context, RecyclerView.VERTICAL, false)
        binding.rvEarlier.layoutManager = LinearLayoutManager(this.context, RecyclerView.VERTICAL, false)
    }
}