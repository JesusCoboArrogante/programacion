package org.example.models

class Acomision(nombre:String, apellido:String, val ventas:Int, val porcentaje:Double):Trabajador(nombre, apellido) {
    override fun Calcularsalario() {
        val salarioFinal = (ventas * porcentaje) / 100
    }


}
