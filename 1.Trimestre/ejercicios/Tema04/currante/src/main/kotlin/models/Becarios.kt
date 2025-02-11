package org.example.models

class Becarios(nombre:String, apellido:String, val sueldo:Int, tiempo:Int):TrabajadoresEspeciales(nombre, apellido, tiempo) {
    override fun Calcularsalario() {
        println("100")
    }




}