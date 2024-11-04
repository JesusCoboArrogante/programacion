package org.example.funciones

/**
 * Une los numeros que anteriormente eran letras y luego lo transforma en in Int
 * @param pasaporte
 * @param letraNumero son los numeros que anteriormente eran letras
 * @return numerosUnidos: que es la concatenacion de letraNumero y los numero del pasaporte
 */
fun funUnirNumeros(pasaporte: String, letraNumero: String): Int {
    var numeroUnidos = ""

    for (i in letraNumero.indices){
        numeroUnidos+= letraNumero[i]

    }

    for (i in 3..<pasaporte.length-1){

        numeroUnidos+=pasaporte[i]
    }
    println(numeroUnidos)
    return numeroUnidos.toInt()
}

/**
 * Transforma las 3 primeras letras del pasaporte en numeros
 * @param pasaporte
 * @return letraAnumero: devuelve una variable en forma de cadena de los numeros que representa sus letras
 */

fun funTransformarletra(pasaporte: String): String {
    var letraAnumero = ""

    for (i in 0..2){
        when(pasaporte[i]){
            'A'-> letraAnumero += "0"
            'B'-> letraAnumero +='1'
            'C'-> letraAnumero +='2'
            'D'-> letraAnumero +='3'
            'E'-> letraAnumero +='4'
            'F'-> letraAnumero +='5'
            'G'-> letraAnumero +='6'
            'H'-> letraAnumero +='7'
            'I'-> letraAnumero +='8'
            'J'-> letraAnumero +='9'
            'K' -> letraAnumero +="10"
            'L' -> letraAnumero +="11"
            'M' -> letraAnumero +="12"
            'N' -> letraAnumero +="13"
            'O' -> letraAnumero +="14"
            'P' -> letraAnumero +="15"
            'Q' -> letraAnumero +="16"
            'R' -> letraAnumero +="17"
            'S' -> letraAnumero +="18"
            'T' -> letraAnumero +="19"
            'U' -> letraAnumero +="20"
            'V' -> letraAnumero +="21"
            'W' -> letraAnumero +="22"
            'X' -> letraAnumero +="23"
            'Y' -> letraAnumero +="24"
            'Z' -> letraAnumero +="25"

        }
    }

    return letraAnumero

}

/**
 * Si letra es true eso quiere decir que las letras son correctas y se puede verificar que los digitos entre 3 y 9 son numeros
 * @param pasaporte
 * @param letra
 * return numero: devuelve un boolean si es true los numeros son correctos y si es false no
 */

fun funComprobarnumero(pasaporte: String, letra: Boolean): Boolean {
    var numero = false
    var contador = 0
    if (letra){
        for (i in 3..<pasaporte.length){
            if (pasaporte[i] in '0'..'9'){
                contador++
            }
        }
        if (contador == 6){
            numero = true
            println("numero del $pasaporte correcto")
        }else{
            println("numero del $pasaporte incorrecto")
        }
    }

    return numero
}

/**
 * Comprueba que los 3 primeros digitos sean letras
 * @param pasaporte
 * @return letra: si devuelve un true significa que los 3 primeros digitos son letras
 */

fun funComprobarLetraPasaporte(pasaporte: String): Boolean {
    var letra = false
    var contador = 0

    for (i in 0..2){
        if (pasaporte[i] in 'A'..'Z'){
            contador++

        }
    }

    if (contador == 3){
        letra = true
        println("letras del $pasaporte correctas")
    }else{
        println("letra del $pasaporte incorrecto")
    }

    return letra
}