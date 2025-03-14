package org.example.Models

import java.time.LocalDate

data class Alumno(
    val id:Int,
    val nombre:String,
    val calificacion:Double,
    val convocatoria:Boolean,
    val fx_matriculacion: LocalDate,
    val fx_nacimiento: LocalDate
)
