package com.example.mocktask.model

data class NotificationModel(
    val nImg: Int?=null,
    val nTitle: String,
    val nDetail: String?=null,
    val nTime: String?=null,
    val nNew : Boolean = false,
    val nType : Int = 1
)
