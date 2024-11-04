package org.example

import kotlin.concurrent.thread

val tiempoCambio = 1_000
val encontrar = 50
val coger = 50
fun main() {
    val mapa = IntArray(10)
    var bolsa = 0
    val cambio = 30
    val finjuego = 30_0000
    var tiempoUno: Int
    var tiempoTreinta = 0
    var movimiento = 0
    var direccion = true

    do {
        tiempoUno = 0
        do {

            if (tiempoUno > tiempoCambio){
                tiempoUno = 0
            }
                println("-->")
                println(movimiento)
                tiempoUno = funRecoridoDerecha(mapa,tiempoUno,movimiento)
                movimiento = funRecoridoDerechaPosicion(mapa,tiempoUno,movimiento)
                bolsa = funBolsa(mapa,bolsa)
                tiempoUno+=100
                Thread.sleep(100)
                direccion = false
                println("cambio izquierda")
            if (tiempoUno > tiempoCambio){
                tiempoUno = 0
            }

                println("<--")
                println(movimiento)
                tiempoUno = funRecoridoDerecha(mapa,tiempoUno,movimiento,)
                movimiento = funRecoridoIzquierdaPosicion(mapa,tiempoUno,movimiento)
                bolsa = funBolsa(mapa,bolsa)
                tiempoUno+=100
                Thread.sleep(100)
                direccion = true
                println("cambio derecha")

            if (tiempoUno > tiempoCambio){
                tiempoUno = 0
            }

            tiempoTreinta+=1000
            Thread.sleep(1000)

        }while (tiempoUno < tiempoCambio)

    }while (tiempoTreinta < finjuego)
    println(bolsa)
}



fun funRecoridoIzquierdaPosicion(mapa: IntArray, tiempoUno: Int, izquierda: Int): Int {
    var tiempoUno = tiempoUno
    var izquierda = izquierda

    while (izquierda > 0 && tiempoUno < tiempoCambio){
        izquierda--
        mapa[izquierda] = funRecoger()
        tiempoUno+=100
        Thread.sleep(100)
        println(mapa.joinToString ())
        println(izquierda)
        println(tiempoUno)
    }
    if (tiempoUno > tiempoCambio){
        println("toca cambio $izquierda")
        Thread.sleep(1000)
    }

    return izquierda
}


fun funBolsa(mapa: IntArray, bolsa: Int): Int {

    var bolsa = bolsa

   for(i in mapa.indices){
       bolsa += mapa[i]
   }

    return bolsa
}


fun funRecoridoDerechaPosicion(mapa: IntArray, tiempoUno: Int, derecha: Int): Int {
    var tiempoUno = tiempoUno
    var derecha = derecha

    while (derecha < mapa.size-1 || tiempoUno < tiempoCambio){
        derecha++
        mapa[derecha] = funRecoger()
        tiempoUno+=100
        Thread.sleep(100)
        println(mapa.joinToString ())
        println(derecha)
        println(tiempoUno)
    }
    if (tiempoUno > tiempoCambio){
        println("toca cambio $derecha")
        Thread.sleep(1000)
    }


    return derecha
}

fun funRecoger(): Int {
    var piedra = 0
    if (encontrar < (1..100).random()){
        piedra = funPiedra()
    }
    return piedra
}

fun funPiedra(): Int {
    var piedra = 0
    if (coger < (1..100).random()){
        piedra = (1..20).random()
    }
    return piedra
}

fun funRecoridoDerecha(mapa: IntArray, tiempoUno: Int, derecha: Int): Int {
    var tiempoUno = tiempoUno
    var derecha = derecha

        while (derecha < mapa.size || tiempoUno < tiempoCambio){
            derecha++

            tiempoUno+=100
        }

    return tiempoUno
}



