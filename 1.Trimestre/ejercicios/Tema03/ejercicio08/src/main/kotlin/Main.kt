package org.example

fun main() {
    var cadena = " "
    println("introduce una cadena")
    cadena = readln()
    cadena = cadena.replace(" ", "")

    var boolean = funReverse(cadena)
    funMensaje(boolean, cadena)

}

fun funMensaje(boolean: Boolean, cadena: String) {
    println("cadena normal  $cadena")
    println("cadena reverse ${cadena.reversed()}")
    if (boolean){
        println("es polidromo")
    }else{
        println("no es palindromo")
    }
}


fun funReverse(cadena: String):Boolean {
    var cadena = cadena
    var contador = 0
    var boolean = false



    for (i in cadena.indices){
        if (cadena[cadena.length -1 -i] == cadena[i]){
            contador++
        }
    }


    if (contador == cadena.length){
        boolean = true
    }

    return boolean

}

