package org.example.models

class Fijos(nombre:String, apellido:String, val sueldo:Int, override val edad: Int):Trabajador(nombre, apellido){
    override fun Calcularsalario() {
        TODO("Not yet implemented")
    }

}