package org.example

import org.example.models.Fijos
import org.example.models.PorHoras
import org.example.models.Trabajador

fun main() {

    val t1 = Fijos(
        nombre = "jesus",
        apellido = "cobo",
        sueldo = 1200
    )
    t1.Calcularsalario()
    val v2 = Trabajador()


    val t2 = PorHoras(
        nombre = "oscar",
        apellido = "arrogante",
        horas = 40,
        porHoras = 12.70,
        tiempo = 10
    )
    t2.Calcularsalario()



}