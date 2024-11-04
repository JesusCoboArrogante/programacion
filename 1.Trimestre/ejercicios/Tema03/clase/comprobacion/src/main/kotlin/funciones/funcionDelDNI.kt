package org.example.funcionDni

/**
 * Transforma la cadena del dni en un número, quitando la letra
 * @param dni
 * return numeroDni devuelve solo los numeros del DNI
 */
fun funTransformarDniNumerico(dni: String):Int {
    var numeroDni = 0
    var numero = ""
    for ( i in dni.indices - (dni.length-1) ){
        numero += dni[i]
    }
    numeroDni = numero.toInt()
    return numeroDni




}

/**
 * Divide el número del dni o del pasaporte  entre 23 y el resto que de, se le asigna una letra
 * @param numeroDni es el número del DNI
 * @return letra devuele la letra del DNI
 */

fun funDividirNumero(numeroDni: Int):Char {
    var letra = ' '
    var numero = numeroDni%23

    when(numero){
        0 -> letra ='T'
        1 -> letra ='R'
        2 -> letra ='W'
        3 -> letra ='A'
        4 -> letra ='G'
        5 -> letra ='M'
        6 -> letra ='Y'
        7 -> letra ='F'
        8 -> letra ='P'
        9 -> letra ='D'
        10 -> letra ='X'
        11 -> letra ='B'
        12 -> letra ='N'
        13 -> letra ='J'
        14 -> letra ='Z'
        15 -> letra ='S'
        16 -> letra ='Q'
        17 -> letra ='V'
        18 -> letra ='H'
        19 -> letra ='L'
        20 -> letra ='C'
        21 -> letra ='K'
        22 -> letra ='E'

    }

    return letra

}

/**
 * Comprueba si la letra es igual a la letra del dni o pasaporte
 * @param letra
 * @param dni
 * @return salida devuelve un booleano si la letra es igual a la letra del dni devuelve un true
 */
fun funComprobaLetra(letra: Char, dni: String): Boolean {
    var salida = false
    if (letra == dni.last()){
        println("El $dni existe")
        salida = true
    }else{
        println("El $dni no existe")


    }
    return salida

}

/**
 * Comprueba si el ultimo caracter del DNI es una letra permitada del DNI
 * @param dni
 * @param numero es un booleano que nos indica que si los numero del DNI no son correcto es un false y nos ahorramos comprobar la letra
 * @return letra devuelve un booleano que si el último dígito del DNI en una letra y además esta entra las letras permitidas es un true
 */
fun funComprobarLetraDni(dni: String, numero: Boolean): Boolean {
    var letra = false
    if (numero){
        if (dni[dni.length-1] in 'A'..'Z'){
            if (dni[dni.length-1] != 'I' && dni[dni.length-1] != 'O' && dni[dni.length-1] != 'U' && dni[dni.length-1] != 'Ñ'){
                letra = true
                println("letras del DNI $dni correctasa")
            }else(
                println("letras del DNI $dni incorrectas")
            )

        }else{
            println("letra del DNI $dni incorrecta")
        }
    }
    return letra
}

/**
 * Comprueba si los primeros 8 digitos son numeros
 * @dni
 * @return numero devuelve un booleano si los 8 primeros digitos son numeros devuelve un true
 */

fun funComprobarNumeroDni(dni: String):Boolean {
    var numero = false
    var contador = 0

    for (i in dni.indices-8){
        if (dni[i] in '0'.. '9'){
            contador++
        }
    }

    if (contador == dni.length-1){
        numero = true
        println("numero del DNI $dni correcto")

    }else{
        println("numero del DNI $dni incorrecto")
    }

    return numero
}
