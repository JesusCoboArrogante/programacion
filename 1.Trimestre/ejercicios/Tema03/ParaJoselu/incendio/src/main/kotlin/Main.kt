package org.example
import com.github.ajalt.mordant.rendering.TextColors
import org.lighthousegames.logging.logging
import com.github.ajalt.mordant.terminal.Terminal


val t = Terminal()
val regexTiempo = "tiempo:\\d{2,3}".toRegex()
val regexCuadricula = "cuadricula:\\d{3}".toRegex()
val regexArboles = "arboles:\\d{2,3}".toRegex()
val regexPcrecer = "pcrecer:\\d{1,2}|pcrecer:\\d{3}".toRegex()
val regexParder = "pcarder:\\d{1,2}|parder:\\d{3}".toRegex()
fun main(arg:Array<String>) {
    val logger = logging()


    val parametro = verificacion(arg)
    val tiempo = obtenerNumeros(parametro, regexTiempo,7)
    val cuadricula = obtenerNumeros(parametro, regexCuadricula,11)
    val arboles= obtenerNumeros(parametro, regexArboles,8)
    var pcrecer = obtenerNumeros(parametro, regexPcrecer, 8)
    var parder  = obtenerNumeros(parametro, regexParder,7)



    verificar(150,100,cuadricula)
    verificar(120,60,tiempo)
    verificarArboles(arboles,cuadricula)



}

fun verificarArboles(arboles: Int, cuadricula: Int) {
    var min = cuadricula * 0.3
    var max = cuadricula * 0.8
    println("arboles")
    if (arboles < min || arboles > max){
        println(TextColors.red("Error arboles"))
        exponerError()
    }
}


fun verificar(max:Int, min:Int, numero:Int) {
    println("fun verificar")
    if (numero > max && numero < min){
        exponerError()
    }

}

fun obtenerNumeros(parametro: Array<String>, regex: Regex, n: Int): Int {
    var numero = ""
    var contador = 0
    for (i in parametro.indices){
        if (regex.matches(parametro[i])){
            numero = parametro[i]
            numero = numero.substring(n)
            contador ++

        }
    }
    if (contador >1){
        exponerError()
    }
    return numero.toInt()
}


fun verificacion(parametro:Array<String>): Array<String> {
    val vector = parametro
    when(parametro.size){
        3  -> verificacionRegex(parametro)
        4 -> verificacionRegex(parametro)
        5 -> verificacionRegex(parametro)
        else -> exponerError()
    }
    return vector


}

fun verificacionRegex(parametro: Array<String>) {
    var contador = 0

    val regex = "cuadricula:\\d{3}|arboles:\\d{2,3}|tiempo:\\d{2,3}".toRegex()
    val regexOpcionales ="pcrecer:\\d{1,2} | pcrecer:\\d{3} |parder:\\d{1,2} | parder:\\d{3}".toRegex()
    for (i in parametro.indices){
        if (regex.matches(parametro[i])){
            contador++
        }
    }
    if (contador == 3){
        for (i in parametro.indices){
            if (regexOpcionales.matches(parametro[i])){
                contador++
            }
        }
    }
    if (contador !=parametro.size){
        exponerError()
    }

}

fun meterDatos() {
    var texto = ""
    var numero = 1
    var contador = 1
    println("cuantos parametros vas a poner")
    numero = readln().toIntOrNull()?:0
    val nuevoParametro = Array<String>(numero){""}
    for (i in nuevoParametro.indices){
        println("introduce el $contador º parametros correctos")
        texto = readln()
        nuevoParametro[i] = texto
        contador++
    }

    verificacion(nuevoParametro)
}

fun exponerError() {
    t.println(TextColors.red("Error: los parametros son incorrectos"))
    println("Parametros obligatorios: tiempo:(60-120) cuadricula:(100-150) arboles:(entre un 30% y un 80% del espacio total)")
    println("Parametros opciones: pcrecer:(0-100) parder:(0-100")
    println("Ejemplo: tiempo:55 cuadricula:100 arboles:60 pcarder:10 parder:50")
    meterDatos()
}



