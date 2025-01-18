
import com.github.ajalt.mordant.terminal.Terminal
import models.aula
import org.lighthousegames.logging.logging
val clase = aula()
val txt = Terminal()
val log = logging()
fun main() {
    var eleccion = 0


    do {
        println(" 1. Agregar\n 2. Ver\n 3. Actualuzar\n 4. Borrar\n 5. Salir")
        eleccion = readln().toIntOrNull()?:5
        when(eleccion){
            1 -> agregar()
            2 -> clase.imprimirListado()
            3 -> actualizacion()
            4 -> borrar()

        }

    }while (eleccion != 5)
}

fun actualizacion() {
    var seleccion = 0
    println("que quieres actualizar")
    println("1. nombre\n 2. Apellido\n 3. Notas")
    seleccion = readln().toIntOrNull()?:0
    when(seleccion){
        1 -> nombre()
        2 -> apellido()
        3 -> notas()
    }

}

fun nombre() {
    var nombre = ""
    println ("")

}

fun borrar() {
    var id = 0
    id = readln().toInt()?:0
    clase.eliminar(id)

}

fun agregar() {
    var nombre = ""
    var apellidos = ""
    var notas = 0.0
    println("ingrese nombre, apellidos y notas")
    nombre = readln()
    apellidos = readln()
    notas = readln().toDouble()
    clase.agregar(nombre,apellidos,notas)
}
