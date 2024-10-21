package org.example

fun main() {
    var cadena: String = " "
    println("introduce una cadena")
    cadena = readln()

    cadena = cadena.replace(" ", "")

    val cadenaUno = Array<String>(cadena.length){""}

    funCesar(cadena,cadenaUno)
    println(cadenaUno.joinToString(""))
}



fun funCesar(cadena: String, cadenaUno: Array<String>) {
    for (i in cadena.indices){
        cadenaUno[i] = (cadena[i]+1).toString()
    }
}
