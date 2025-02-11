package org.example

import org.example.dto.AlumnadoDto
import org.example.mappers.dto
import org.example.mappers.toModel

import java.io.File

fun main() {
    val archivo = File("data", "alumnos.csv")

    val alumnos = archivo.readLines().drop(1)
        .map { linea -> linea.split(',') }
        .map { item ->
            AlumnadoDto(
                id = item[0].toInt(),
                nombre = item[1],
                createAt = item[2],
                tipo = item[3],
                edad = item[5].toInt()
            ).toModel()
        }

        alumnos.forEach{println(it)}

    println("el mas viejo")
    val max = alumnos.maxBy { it.edad }
    println("$max")

    println("el mas jove")
    val min = alumnos.minBy {it.edad}
    println("$min")

    println("agrupacion por edad")
    val  agruparEdad = alumnos.groupBy { it.edad }
    println(agruparEdad)

    println("media de edad")
    val mediaEdad = alumnos.map { it.edad }.average().toInt()
    println("$mediaEdad")

   println("media de longitud")
    val nombre = alumnos.map { it.nombre.length }.average()
    println(nombre)

    println("agrupacion: edad y numero de alumnos")
    val edadNumAlumnos = alumnos.groupingBy{ it.edad}.eachCount()
    println("$edadNumAlumnos")

    println("agrupacion edad y longitud de nombre")
    val edadLongitud = alumnos.groupBy { it.edad }.mapValues { it.value.map { it.nombre.length } }
    println(edadLongitud)

    println("agrupacion edad y nombre mas largo")
    val edadNombre = alumnos.groupBy { it.edad }.mapValues { it.value.maxBy { it.nombre } }
    println(edadNombre)
}

