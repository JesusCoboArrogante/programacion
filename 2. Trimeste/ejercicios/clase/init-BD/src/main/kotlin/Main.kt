package org.example

fun main() {
    val url = "jdbc:sqlite:alumno.db"
    val conexion = DriveManager.getConnection(url)
}