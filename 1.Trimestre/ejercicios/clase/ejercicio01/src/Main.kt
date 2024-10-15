fun main() {
    var array = intArrayOf(1,2,3)

    println("imprimir")
    funImprimir(array)

    println("maximo")
    funMax(array)

    println("minimo")
    funMinimo(array)

    println("media")
    funmMedia(array)


}

fun funImprimir(array: IntArray){
        println("${array.joinToString()} ")

}

fun funMax(array: IntArray){
    var max = 0
    for (i in array.indices){
        if (max < array[i]){
            max = array[i]
        }
    }
    println(max)
}

fun funMinimo (array: IntArray){
    var minimo = Int.MAX_VALUE
    for (i in array.indices){
        if (minimo > array[i]){
            minimo = array[i]
        }
    }
    println(minimo)
}

fun funmMedia (array: IntArray){
    var suma = 0
    var contador = 0
    for (i in array.indices){
        contador++
        suma+=array[i]
    }
    println(suma/contador)

}
