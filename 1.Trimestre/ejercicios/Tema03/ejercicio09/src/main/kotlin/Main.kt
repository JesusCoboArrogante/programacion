package org.example

fun main() {
    val matriz = Array(5){IntArray(5)}
    rellenarMatriz(matriz)
    moverReversa(matriz)
    println()
   imprimirMatriz(matriz)



}

fun moverReversa(matriz: Array<IntArray>) {
    for (i in matriz.size-1 downTo 0){
        for (j in matriz.size-1 downTo 0){
            print("[${matriz[i][j]}]")
        }
        println()
    }
}

fun imprimirMatriz(matriz: Array<IntArray>) {
    for (i in matriz.indices){
        for (j in matriz.indices){
            print("[${matriz[i][j]}]")
        }
        println()
    }
}

fun rellenarMatriz(matriz: Array<IntArray>) {
    for (i in matriz.indices){
        for (j in matriz.indices){
            matriz[i][j] = (0..25).random()
        }
    }
}

