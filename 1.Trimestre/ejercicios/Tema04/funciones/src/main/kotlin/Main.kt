package org.example

fun main() {
    val suma = {a:Int, b:Int -> a + b}
    val resta = {a:Int, b:Int -> a - b }
    val multiplicar = {a:Int, b:Int -> a*b}
    val dividir = {a:Int, b:Int -> a/b}
    println(suma(10,5))
    println(resta(10,5))
    println(multiplicar(10,5))
    println(dividir(10,5))


}