package org.example

import org.example.models.Pokemon
import java.io.File
import java.io.PrintStream

fun main() {
    val  pokemon = File("data", "pokemon.csv")

    val pokedex = pokemon.readLines().drop(1)
        .map { linea -> linea.split(',') }
        .map { item ->
            Pokemon(
                id = item[0].toInt(),
                nombre = item[1],
                tipo1 = item[2],
                tipo2 = item[3],
                total = item[4].toInt(),
                hp = item[5].toInt(),
                attack = item[6].toInt(),
                defensa = item[7].toInt(),
                spAtk = item[8].toInt(),
                spDef = item[9].toInt(),
                speed = item[10].toInt(),
                generation = item[11].toInt(),
                legendario = item[12].toBoolean()
            )
        }
    val nombre = pokedex.map { it.nombre }
    nombre.forEach{ println(it)}

    println("---------------------------------------------")

    val nombreTipo = pokedex.map { it.nombre + " | " +  it.tipo1 }
    nombreTipo.forEach{ println(it)}

    println("---------------------------------------------")
    val cienAtaque = pokedex.filter { it.attack > 100 }
    cienAtaque.forEach { println(it.nombre + " | " + it.attack) }

    println("---------------")
    println("letra P")
    val letraP = pokedex.filter { it.nombre.startsWith("P", ignoreCase = true)}
    letraP.forEach { println(it.nombre) }

    println("-----------------------------------------------")
    val media = pokedex.filter { it.tipo1 == "Fire" || it.tipo2 == "Plant"}.map { it.attack }.average()
    println(media)











}