package org.example
import org.lighthousegames.logging.logging
import org.example.`object`.fracciones
val log = logging()

fun main() {
    val a = fracciones(4,6)
    val b = fracciones(45,60)
    val c = fracciones(0)
    c.sumar(a.numerador,a.denominador,b.numerador,b.denominador)
    println(c.toString())
    c.multiplicar(a.numerador,a.denominador,b.numerador,b.denominador)
    println(c.toString())
    a.simplificar(b.numerador,b.denominador)
    println(a.toString())




}