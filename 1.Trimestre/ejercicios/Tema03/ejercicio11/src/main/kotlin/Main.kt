package org.example

/**
 * @author Jesus Cobo
 */
fun main() {
    val NUMERO = 49
    val numeroPrimitiva = funGenerar(NUMERO)
    val primitiva = funPrimitiva(numeroPrimitiva)
    println(primitiva.joinToString())

}

/**
 * Crea un vector de 49 número entre el 1 y el 49 ambos incluidos
 * @param NUMERO de cuanto quieres que sea el vector
 * @return Array: devuelve un array de enteros de 1 al NUMERO
 */

fun funGenerar(numero:Int): IntArray {
    val array = IntArray(numero)
    for (i in 0..<numero){
        array[i] = i+1
    }
    return array
}

/**
 * Mete dentro de un vector de 6 numeros aleatorios entre el 1 al 49
 * @param numeroPrimitiva es el vector donde se consigue los numeros del 1 al 49
 * @return array: Devuelve un vector de enteros
 */

fun funPrimitiva(numeroPrimitiva: IntArray): IntArray {
    val array = IntArray(6)

    for (i in array.indices){

               array[i] = funCombrobar(i, numeroPrimitiva,array)

    }
    return  array
}

/**
 * Comprueba que el número aleatorio sea mayor a 0
 * @param i indica en que parte del índice esta
 * @param numeroPrimitiva es el vector donde se consigue los numeros del 1 al 49
 * @param array donde se va a amacenar los numeros de la primitiva
 * @return array[i]: devuelve un numero mayor a 0
 */
fun funCombrobar(i: Int, numeroPrimitiva: IntArray, array: IntArray): Int {
    var numero = 0
    do {
        numero = (numeroPrimitiva).random()
        if (numero > 0){
            array[i] = numero
            funBorrar(numero,numeroPrimitiva)
        }
    }while (numero == 0)
    return array[i]
}


/**
 * Si el numero esta dentro de numeroPrimitiva lo cambia a 0 dentro de primitiva
 * @param numero almacena un número aleatorio que debe estar dentro de numeroPrimitiva
 * @param numeroPrimitiva un vector que almacena numeros del 1 al 49
 */

fun funBorrar(numero: Int, numeroPrimitiva: IntArray) {
    for (i in numeroPrimitiva.indices){
        if (numero == numeroPrimitiva[i]){
            numeroPrimitiva[i] = 0
        }
    }
}













