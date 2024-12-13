package org.example

import org.example.models.enemigos
import org.example.models.hogwarts

fun main(arg:Array<String>) {
    val tamano = mapa(arg)
    val huested = enemy(arg)
    val batalla = hogwarts(tamano)
    var contador = 0
    do {
        val nuevoEnemigo = enemigos.generar()

        batalla.generarEnemigo(nuevoEnemigo)
        println(contador)
        contador++
    }while (contador != huested)

    batalla.imprimir()





}

fun enemy(arg: Array<String>): Int {
    val numero = arg[1].toInt()
    return numero
}

fun mapa(arg: Array<String>): Int {
    val numero = arg[0].toInt()
    return numero
}
