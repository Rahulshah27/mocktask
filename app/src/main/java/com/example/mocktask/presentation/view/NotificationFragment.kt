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

class NotificationFragment: Fragment(R.layout.notification_fragment) {

    private var notificationAdapter = NotificationAdapter(
        listOf(
            NotificationModel(nTitle = "New",type = 1),
            NotificationModel(nImg = R.drawable.img,type = 0,nTitle =  "Next Module awaits!",
                nDetail =  "it has been 2 weeks since you finshed your previous work!",nTime =  "12 Minutes ago",new = true),
            NotificationModel(nImg = R.drawable.img,type = 0,nTitle =  "Next Module awaits!",
                nDetail =  "it has been 2 weeks since you finshed your previous work!",nTime =  "12 Minutes ago"),
            NotificationModel(nImg = R.drawable.img,type = 0,nTitle =  "Next Module awaits!",
                nDetail =  "it has been 2 weeks since you finshed your previous work!",nTime =  "12 Minutes ago"),
            NotificationModel(nTitle = "Earlier",type = 1),
            NotificationModel(nImg = R.drawable.img,type = 0,nTitle =  "Next Module awaits! 2",
                nDetail =  "it has been months since you finshed your previous work!",nTime =  "30 Minutes ago"),
            NotificationModel(nImg = R.drawable.img,type = 0,nTitle =  "Next Module awaits! 2",
                nDetail =  "it has been months since you finshed your previous work!",nTime =  "30 Minutes ago"),
            NotificationModel(nImg = R.drawable.img,type = 0,nTitle =  "Next Module awaits! 2",
                nDetail =  "it has been months since you finshed your previous work!",nTime =  "30 Minutes ago"),
            NotificationModel(nImg = R.drawable.img,type = 0,nTitle =  "Next Module awaits! 2",
                nDetail =  "it has been months since you finshed your previous work!",nTime =  "30 Minutes ago"),
            NotificationModel(nImg = R.drawable.img,type = 0,nTitle =  "Next Module awaits! 2",
                nDetail =  "it has been months since you finshed your previous work!",nTime =  "30 Minutes ago")
        )
    )



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = NotificationFragmentBinding.bind(view)

        binding.rvNew.adapter = notificationAdapter
        binding.rvNew.layoutManager = LinearLayoutManager(this.context, RecyclerView.VERTICAL, false)
    }
}