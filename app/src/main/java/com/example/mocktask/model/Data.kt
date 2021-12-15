package com.example.mocktask.model

data class NotificationModel(
    val nImg: Int?=null,
    val nTitle: String,
    val nDetail: String?=null,
    val nTime: String?=null,
    val new : Boolean = false,
    val type : Int = 1
)
