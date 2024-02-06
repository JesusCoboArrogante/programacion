fun main(args: Array<String>) {
    var matrizUno = arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9) )
    var matrizDos = arrayOf(intArrayOf(11,12,13), intArrayOf(14,15,16), intArrayOf(17,18,19) )
    matriz(matrizUno, matrizDos)
    println(" sumar")
    sumar(matrizUno, matrizDos)
    println("restar")
    resta(matrizUno, matrizDos)
    println("multiplicar")
    multiplicar(matrizUno, matrizDos)

}

fun multiplicar(matrizUno: Array<IntArray>, matrizDos: Array<IntArray>) {
    var resultado = 0
    for (i in matrizUno.indices){
        for (j in matrizUno.indices){
            resultado = matrizUno[i][j] * matrizDos[i][j]
            print(" $resultado ")

        }
    println()
    }

}

fun resta(matrizUno: Array<IntArray>, matrizDos: Array<IntArray>) {
    var resultado = 0
    for (i in matrizUno.indices){
        for (j in matrizUno.indices){
            resultado = matrizUno[i][j] - matrizDos[i][j]
            print(" $resultado ")
        }
        println()
    }

}

fun matriz(matrizUno: Array<IntArray>, matrizDos: Array<IntArray>) {
    var resultado = 0
    for (i in matrizUno.indices){
        for (j in matrizUno.indices){
            print(" ${matrizUno[i][j]}  ")
        }

        println()

    }
    print(" ----------")
    println()
    for (i in matrizDos.indices){
        for (j in matrizDos.indices){
            print(" ${matrizDos[i][j]} ")
        }
        println()
    }

}

fun sumar(matrizUno: Array<IntArray>, matrizDos: Array<IntArray>) {
    var resultado = 0
    for (i in matrizUno.indices){
        for (j in matrizUno.indices){
            resultado = matrizUno[i][j] + matrizDos[i][j]
            print(" $resultado ")
        }
        println()
}
}

