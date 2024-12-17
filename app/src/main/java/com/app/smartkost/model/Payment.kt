package com.app.smartkost.model

data class Payment(
    val roomNumber: String,
    val name: String,
    val payment: String,
    val rentStatus: String,
    val electricity: String,
    val water: String
)
