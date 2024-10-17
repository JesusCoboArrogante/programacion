fun main() {
    var array = arrayOf(5,7,3)
    var maximo = funMaximo(array)
    var minimo = funMinimo(array)
    var media = funMedia(array)
    println(array.joinToString())
    println("el numero maximo es el $maximo")
    println("el numero minimo es el $minimo")
    println("la media es $media")
}

fun funMedia(array: Array<Int>): Int {
    var media = 0
    var contador = 0
    for (i in array.indices){
        media += array[i]
        contador++
    }
    media/=contador
    return media
}

fun funMinimo(array: Array<Int>): Int {
    var minimo = Int.MAX_VALUE
    for (i in array.indices){
        if (array[i] < minimo){
            minimo = array[i]
        }
    }
    return minimo
}

fun funMaximo(array: Array<Int>): Int {
    var maximo = 0
    for (i in array.indices){
        if (array[i] > maximo){
            maximo = array[i]
        }
    }
    return maximo
}
