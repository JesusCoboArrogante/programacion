package org.example.models

import java.time.LocalDate
import java.time.LocalDateTime

data class Alumnado(
    val id:Int,
    val nombre:String,
    val createAt: LocalDate = LocalDate.now(),
    val tipo:String,
    val edad:Int
)
