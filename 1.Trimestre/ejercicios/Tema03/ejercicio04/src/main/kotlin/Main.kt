package org.example

fun main() {
    var matrizUno = Array(3){IntArray(3)}
    var matrizDos = Array(3){IntArray(3)}
    var matrizTres = Array(3){IntArray(3)}
    llenar(matrizUno)
    llenar(matrizDos)

    multiplicar(matrizUno,matrizDos,matrizTres)
    sumar(matrizUno,matrizDos,matrizTres)
    restar(matrizUno,matrizDos,matrizTres)

    println("${imprimir(matrizUno)} * ${imprimir(matrizDos)} = ${imprimir(matrizTres)}")



}

fun restar(matrizUno: Array<IntArray>, matrizDos: Array<IntArray>, matrizTres: Array<IntArray>) {
    for (i in matrizDos.indices){
        for (j in matrizDos.indices){
            matrizTres[i][j] = matrizUno[i][j]-matrizUno[i][j]
        }
    }
}

fun sumar(matrizUno: Array<IntArray>, matrizDos: Array<IntArray>, matrizTres: Array<IntArray>) {
    for (i in matrizDos.indices){
        for (j in matrizDos.indices){
            matrizTres[i][j] = matrizUno[i][j]+matrizUno[i][j]
        }
    }
}

fun multiplicar(matrizUno: Array<IntArray>, matrizDos: Array<IntArray>, matrizTres: Array<IntArray>) {
    for (i in matrizDos.indices){
        for (j in matrizDos.indices){
            matrizTres[i][j] = matrizUno[i][j]*matrizUno[i][j]
        }
    }
}

fun llenar(matriz: Array<IntArray>){
    for (i in matriz.indices){
        for (j in matriz.indices){
            matriz[i][j] = (1..9).random()
        }
    }
}

fun imprimir(matriz: Array<IntArray>){
    for (i in matriz.indices){
        for (j in matriz.indices){
            print(matriz[i][j])
        }
        println()
    }

}