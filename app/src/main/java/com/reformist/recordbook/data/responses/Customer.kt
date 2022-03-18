package com.reformist.recordbook.data.responses

data class Customer(
    val name: String,
    val cust_type: String,
    val village: String,
    val mobile: String,
    val alternet_mobile: Any,
    val id: Int
)