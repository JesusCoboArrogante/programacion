package org.example

const val precio = 5.50

fun main(args: Array<String>) {
    var entradas = args[0].toInt()
    val vectorGuardar = Array(2) { IntArray(entradas) }
    var asientos = 30
    val cine = arrayOf(
        arrayOf("[-]","[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[-]","[-]","[P]","[P]","[P]","[-]"))
    generarAlfanumerico(cine)

    sentarGente(cine)
    asientos -= contarAsientos(cine)

    entradas = comprobrarEntradasAsientos(entradas, asientos)

    crearMenu(cine,vectorGuardar,entradas,asientos)
}




