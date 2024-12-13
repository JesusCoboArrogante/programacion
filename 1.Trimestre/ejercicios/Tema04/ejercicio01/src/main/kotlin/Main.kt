package org.example

fun main() {

    val hora = horas(0,10,70)


    hora.verificarhora()
    hora.verificarMs(hora.minutos)
    hora.verificarMs(hora.segundos)

    println(hora.toString())

    val tipo = hora.ampm()
    hora.cambiarhora()
    println(hora.toString() + tipo)













}