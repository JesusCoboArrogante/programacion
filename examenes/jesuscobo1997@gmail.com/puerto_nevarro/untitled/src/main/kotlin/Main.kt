package org.example

import org.example.models.naves
import org.example.models.nevarro

fun main() {
    var eleccion = 0
    val arsenal = 5
    val puertas = 5
    val puerto = nevarro(arsenal,puertas)

    do {
        println("seleccione la opcion \n 1. Ver plazas libres \n 2. Aparcar \n 3. Buscar nave \n 4. Irse \n 5. Listado \n 6. Salir ")
        eleccion = readln().toIntOrNull()?:6
        when(eleccion){
            2 -> {
                val id = seleccionarId()
                val tipo = seleccionarTipo()
                val ubicacion = seleccionarLetra()
                puerto.aparcar(id, tipo, ubicacion)
            }

        }
    }while (eleccion != 6)

}

/**
 * Pide por teclado las coordenadas para aparcar la nave
 * return ubicacion devuelve las coordenadas de donde queremos aparacar
 */
fun seleccionarLetra():String {
    var ubicacion = ""
    println("introduce la ubicacion")
    ubicacion = readln()
    return ubicacion

}


/**
 * Pide por teclado el tipo de nave y verifica que sea correcto
 * @return tipo devuel el tipo de nave
 */
fun seleccionarTipo(): String {
    var salida = false
    var tipo = ""

    do {
        println("introduzca el tipo de nave de batalla o cargero")
        tipo = readln()
        println(naves.funcion.batalla)
        if (tipo == naves.funcion.batalla.toString()|| tipo == naves.funcion.cargero.toString() ){
            salida = true

        }else{
            println("Error debe ser del tipo batalla o cargero")
        }

    }while (!salida)
    return tipo
}

/**
 * Pide el id por por expresion regular verifica ue sea correcta
 * @return devuelve el id correcto
 */
fun seleccionarId():String{
    val regex = Regex("\\w{3}\\d{3}\\w")
    var id = ""
    println("introduzca el id de la nave")
    id = readln()

    if (regex.matches(id)){
        println("codigo correcto")
    }else{
        println("codigo incorrecto, debe ser LLLNNNL")
    }
    return id
}
