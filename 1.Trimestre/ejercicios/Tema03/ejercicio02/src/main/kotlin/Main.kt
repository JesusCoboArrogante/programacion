package org.example

import com.github.ajalt.mordant.rendering.TextColors

fun main() {

    val  matriz =Array(5) {IntArray(5)}
    rellenarMatriz(matriz)
    imprimirMatriz(matriz)
    println()
    //imprimirMatrizB(matriz)
    var mayor: Int = cogerMayor(matriz)
    val menor = cogerMenor(matriz)
    val media = cogerMedia(matriz)
    val repetidor = cogerRepetidor(matriz)
    println(TextColors.red("el mayor es $mayor, ")+
            TextColors.blue("el menor es $menor, ")+
            TextColors.green("la media es $media ")+
            TextColors.yellow("y el que mas se repite es el $repetidor"))



}
fun cogerRepetidor(matriz: Array<IntArray>): Int {
    var numero: Int
    var control = 0
    var contador: Int
    var maxRepetidor = 0
    for (i in matriz.indices) {
        for (j in matriz.indices) {

            numero = matriz[i][j]
            contador = contarNumero(numero,matriz)
            if (contador > control){
                maxRepetidor = numero
                control = contador
            }


        }

    }


    return maxRepetidor
}

fun contarNumero(numero: Int, matriz: Array<IntArray>): Int {
    var contador = 0
    for (i in matriz.indices) {
        for (j in matriz.indices) {
            if (numero == matriz[i][j]){
                contador++
            }


        }

    }
    return contador
}


fun cogerMedia(matriz: Array<IntArray>): Int {
    var numero = 0
    for (i in matriz.indices) {
        for (j in matriz.indices) {

                numero += matriz[i][j]


        }

    }
    return numero / 25
}

fun cogerMenor(matriz: Array<IntArray>): Int {
    var numero = Int.MAX_VALUE
    for (i in matriz.indices) {
        for (j in matriz.indices) {
            if (matriz[i][j] < numero) {
                numero = matriz[i][j]
            }

        }

    }
    return numero
}

fun cogerMayor(matriz: Array<IntArray>):Int {
    var numero = 0
    for (i in matriz.indices){
        for (j in matriz.indices){
            if (matriz[i][j] > numero){
                numero = matriz[i][j]
            }

        }

    }
    return numero
}


fun imprimirMatrizB(matriz: Array<IntArray>) {
    for (i in matriz.indices-3){
        for (j in matriz.indices-3){
            print("[${matriz[i][j]}]")
        }
        println()
    }
}

fun imprimirMatriz(matriz: Array<IntArray>) {
    for (i in matriz.indices){
        for (j in matriz[i].indices){
           print("[${matriz[i][j]}]")
        }
        println()
    }
}

fun rellenarMatriz(matriz: Array<IntArray>) {
    for (i in matriz.indices){
        for (j in matriz.indices){
            matriz[i][j] = (0..15).random()
        }
    }
}

