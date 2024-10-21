package org.example

import java.lang.Thread.sleep

fun main() {
    var arrayUno = arrayOf(1,1,2,2,3,3,4,4,5,5,6,6)
    var arrayDos = IntArray(arrayUno.size)


    funAzar(arrayUno,arrayDos)


    println(arrayUno.joinToString(" "))

    var ganar = false



    do {
        var posicionUno = funNumero("introduce un numero entre 1 y 12")-1
        var posicionDos = funNumero("introduce un numero entre 1 y 12")-1

        funAceptar(posicionUno,posicionDos,arrayDos,arrayUno)
        funFallar(posicionUno,posicionDos,arrayDos,arrayUno)

        ganar = funGanar(arrayUno)

    }while (!ganar)

    if (ganar){
        println("enhorabuena has ganado ")
    }

}


fun funAzar(arrayUno: Array<Int>, arrayDos: IntArray) {
    for (i in arrayUno.indices){
        do {
            val numero = arrayUno.random()
            if (numero > 0){
                arrayDos[i] = numero
                funBorrar(arrayUno, numero)
            }
        }while (numero == 0)

    }
}
fun funBorrar(arrayUno: Array<Int>, numero: Int) {
    var contador = 0
    for (i in arrayUno.indices){
        if (arrayUno[i] == numero && contador <1){
            arrayUno[i] = 0
            contador++
        }
    }
}

fun funNumero(mensaje: String): Int {
    var numero = 0
    var inPutSalida = false
    do {
        println(mensaje)
        numero = readln().toIntOrNull()?:0
        if (numero in 1..12){
            inPutSalida = true
        }else{
            println("el numero debe ser entre 1 y 12")
        }
    }while (!inPutSalida)
    return numero

}
fun funAceptar(posicionUno: Int, posicionDos: Int, arrayDos: IntArray, arrayTres: Array<Int>){
    if (arrayDos[posicionUno] == arrayDos[posicionDos]) {
        arrayTres[posicionUno] = arrayDos[posicionUno]
        arrayTres[posicionDos] = arrayDos[posicionDos]
        println("correcto")

    }
    println(arrayTres.joinToString())

}

fun funGanar(arrayTres: Array<Int>): Boolean {
    var contador = 0
    var ganar = false

    for (i in arrayTres.indices){
        if (arrayTres[i] != 0){
            contador++
        }
    }
    if (contador == arrayTres.size){
        ganar = true
    }
    return ganar
}

fun funFallar(posicionUno: Int, posicionDos: Int, arrayDos: IntArray, arrayTres: Array<Int>) {
    if (arrayDos[posicionUno] != arrayDos[posicionDos]) {
        arrayTres[posicionUno] = arrayDos[posicionUno]
        arrayTres[posicionDos] = arrayDos[posicionDos]
        println("fallo")
        println(arrayTres.joinToString())
        sleep(1000)
        arrayTres[posicionUno] = 0
        arrayTres[posicionDos] = 0
        println(arrayTres.joinToString())
    }






}








