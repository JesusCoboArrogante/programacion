package org.example.models

data class naves(
    val id:String,
    val tipo:String,
    val tamano:String
){

    enum class funcion{
        batalla, cargero
    }

    enum class capacidad{
        grande, pequena, mediana
    }
}




