package org.example

import org.example.moduls.alumnos
import org.example.moduls.aula
import org.lighthousegames.logging.logging

val log = logging()
val aula = aula()

fun main(){
    var eleccion: Int
    val nuevoalumno = alumnos.generar()

    for (i in 1..10){
        aula.crear(alumnos.generar())
    }

    do {

        println("1.Ver lista \n" + "2.Agregar alumno\n" + "3.Actualizar \n" + "4.Borrar\n" + "5.Resultado\n" + "6.Salir" )
        eleccion = readln().toIntOrNull()?:6
        when(eleccion){
            1 -> verLista()
            2 -> aula.crear(alumnos.generar())
            3 -> actualizar(nuevoalumno)
            4 -> borrar()
            5 -> aula.resultado()
        }
    }while (eleccion != 6)
}

fun borrar() {
    var eleccion = 0
    eleccion = readln().toIntOrNull()?:-1

    aula.borrar(eleccion)
}

fun actualizar(nuevoalumno: alumnos) {

    val nombre: String
    val apellido: String
    val calificacion: Double
    println("que quieres actualizar")
    println("1.nombre \n" + "2.apellido \n" + "3.notas")
    val eleccion: Int = readln().toInt()?:5
    val nuevoDato:alumnos
    var id = 0

    if (eleccion == 1){
        println("introduce el nombre")
        nombre = readln()
        println("introduce el id")
        id = readln().toIntOrNull()?:-1
        nuevoDato = nuevoalumno.copy(nombre = nombre)                                                                                                                                                                                                                                                                               
        aula.actualizar(id, nuevoDato)
    }else if (eleccion == 2){
        println("introduce el apellido")
        apellido = readln()
        println("introduce el id")
        id = readln().toIntOrNull()?:-1
        nuevoDato = nuevoalumno.copy(apellido = apellido,)
        aula.actualizar(id, nuevoDato)
    }else if (eleccion == 3){
        println("introducir nota")
        calificacion = readln().toDoubleOrNull()?:11.0
        println("introduce el id")
        id = readln().toIntOrNull()?:-1
        nuevoDato = nuevoalumno.copy(calificacion = calificacion)
        aula.actualizar(id, nuevoDato)
    }else(println("salir"))

}

fun verLista() {
    var eleccion: Int
    println("Como ver la lista")
    do {
        println("1. Ordena por notas actendente\n" + "2. Ordena por notas Descendente\n" + "3. Ordena por apellido actendente\n" + "4. Ordena por apellido descendente")
        eleccion = readln().toIntOrNull()?:5
        when(eleccion){
            1 -> aula.imprimir(aula.notaAsc())
            2 -> aula.imprimir(aula.notaDes())
            3 -> aula.imprimir(aula.apellAsc())
            4 -> aula.imprimir(aula.apellDes())
        }


    }while (eleccion !=5)


}









