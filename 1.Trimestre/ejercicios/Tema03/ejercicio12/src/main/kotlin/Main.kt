package org.example

/**
 * @author Jesus Cobo
 */
fun main() {

    val numero:Int = funNumero("Introduce un numero")
    funSumaUno(numero)
    funSumaDos(numero)
}

/**
 * El numero que pida el usuario sea mayor a 1
 * @return Numero: devuelve el numero que cumpla con las condiciones
 */
fun funNumero(mensaje: String): Int {
    var numero = 0
    var inPutSalida = false

    do {
        println(mensaje)
        numero = readln().toIntOrNull()?:-1
        if (numero >=0){
            inPutSalida = true
        } else{
            println("numero debe ser mayor o igual a 0")
        }
    }while (!inPutSalida)
    return numero

}

/**
 * Este es el ejercicio 12 de sumar 1
 * @param numero al que se le sumara uno
 */


fun funSumaUno(numero: Int) {
    val array = IntArray(7)
    for (i in array.indices){
        if (i == 0){
            array[i] = numero
        }else{
            array[i] = array[i-1] + 1
        }

    }
    println(array.joinToString())
}

fun funSumaDos(numero: Int) {
    val array = IntArray (7)
    for (i in array.indices){
        if (i == 0){
            array[i] = numero
        }else{
            array[i] = array[i -1] +i
        }
    }

    println(array.joinToString ())
}




