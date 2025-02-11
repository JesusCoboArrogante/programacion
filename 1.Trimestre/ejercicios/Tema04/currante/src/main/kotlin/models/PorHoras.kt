package org.example.models

class PorHoras(nombre:String, apellido:String, val horas: Int, val porHoras:Double, tiempo: Int):TrabajadoresEspeciales(nombre, apellido, tiempo){

    override fun Calcularsalario() {
         val salario = horas * porHoras
        println(salario)
    }
}
