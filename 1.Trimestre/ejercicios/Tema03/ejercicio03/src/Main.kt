fun main() {
    var arrayUno = arrayOf(1,2,3)
    var arrayDos = arrayOf(4,5,6)

    var arraySuma = funArraySuma(arrayUno, arrayDos)
    var arrayResta = funArrayResta(arrayUno,arrayDos)


    println("arrayUno: ${arrayUno.joinToString(" | ")}")
    println("arrayDos: ${arrayDos.joinToString(" | ")}")

    println("arraySuma: ${arraySuma.joinToString(" | ")}")
    println("arrayResta: ${arrayResta.joinToString(" | ")}")

    funArrayMultiplicacion(arrayUno, arrayDos)



}

fun funArrayMultiplicacion(arrayUno: Array<Int>, arrayDos: Array<Int>) {
    var arrayUn = IntArray (3)
    var arrayDo = IntArray (3)
    for (i in arrayUno.indices){
        arrayUn[i] = arrayUno[i] * 3
        arrayDo[i] = arrayDos[i] * 3

    }
    println("arrayUno: ${arrayUn.joinToString(" | ")}")
    println("arrayDos: ${arrayDo.joinToString(" | ")}")

}


fun funArrayResta(arrayUno: Array<Int>, arrayDos: Array<Int>): IntArray {
    var array = IntArray (3)
    for (i in array.indices){
        array[i] = arrayUno[i] - arrayDos[i]
    }
    return array

}

fun funArraySuma(arrayUno: Array<Int>, arrayDos: Array<Int>): IntArray {
    var array = IntArray (3)
    for (i in array.indices){
        array[i] = arrayUno[i] + arrayDos[i]
    }
    return array
}
