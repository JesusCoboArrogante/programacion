package org.example.models

import java.time.LocalDate

data class Vehiculo(
    val id:Int,
    val matricula:String,
    val marca:String,
    val modelo:String,
    val fechaMatricula: String,
    val permidoActivo:Boolean,
    val tipo: tipo
){
}



enum class tipo{
    ELECTRICO,HIBRIDO,COMBUSTION
}


