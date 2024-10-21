package org.example



fun main() {

    val arrayEspectador = arrayOf("[1]","[2]","[3]","[4]","[5]","[6]",)
    println(arrayEspectador.joinToString(""))
    val arrayMosca = Array<String> (6) {"[ ]"}
    funMoverMosca(arrayMosca)
    var contador = 0
    var ganar = false
    do {
        val numero: Int = funNumero("introduce un numero entre 1 y 6")-1
        ganar = funGanar(arrayMosca,numero)
        contador =funCasi(numero,arrayMosca,contador)

    }while (contador < 5 && !ganar )

    if (ganar){
        println("has ganado con $contador intentos")
    }else{
        println("has perdido")
    }





}
fun funMoverMosca(arrayMosca: Array<String>) {
    for (i in arrayMosca.indices){
        arrayMosca[i] = "[ ]"
    }
    val r = (0..5).random()
    arrayMosca[r] = "[M]"

}

fun funNumero(mensaje:String): Int {
    var numero = 0
    var inPutSalida = false
    do {
        println(mensaje)
        numero = readln().toIntOrNull() ?: 0

        if (numero in 1..6) {
            inPutSalida = true
        } else {
            println("el numero debe ser entre 1 y 6")
        }
    } while (!inPutSalida)
    return numero
}


fun funCasi(numero: Int, arrayMosca: Array<String>, contador:Int):Int {
    var contador = contador
    if (numero > 0 && arrayMosca[numero -1] == "[M]" ) {
        println("casi")
        funMoverMosca(arrayMosca)
        contador++


    }else if (numero < 5 && arrayMosca[numero+1] == "[M]"){
        println("casi")
        funMoverMosca(arrayMosca)
        contador++


    }else if (arrayMosca[numero]!= "[M]" ){
        println("has fallado")
        contador++


    }
    return contador


}

fun funGanar(arrayMosca: Array<String>, numero: Int): Boolean {
    var ganar = false
    if (arrayMosca[numero] == "[M]"){
        println("Mosca muerta")
        ganar = true
    }
    return ganar
}




