package org.example

fun main() {
    var numero = 1
    var cadena: String = " "
    println("introduce una cadena")
    cadena = readln()
    var cadenaUno = ""
    
    cadena = funReplace(cadena,' ', "")

    cadenaUno = funCesar(cadena,numero).toString()

    println(cadenaUno)



}

fun funReplace(cadena: String, viejo:Char, nuevo:String): String {
    var cadenaDos = ""

    var c = 0
    var antiguo = 0
    for (i in cadena.indices){
        if (cadena[c] == ' '){
            antiguo++
        }
        c++
    }
    c = 0
    while (cadenaDos.length != cadena.length-antiguo){

        if (cadena[c] == viejo){
            cadenaDos += nuevo
            antiguo++


        }else{
            cadenaDos += cadena[c].toString()

        }
        c++

    }

    return cadenaDos



}


fun funCesar(cadena: String, numero: Int): String {
    var cadenaUno = ""
    for (i in cadena.indices){
        cadenaUno += (cadena[i]+numero)
    }
    return cadenaUno
}



