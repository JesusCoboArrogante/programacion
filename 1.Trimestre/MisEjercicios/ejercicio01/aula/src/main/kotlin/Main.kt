
import com.github.ajalt.mordant.terminal.Terminal
import com.github.ajalt.mordant.rendering.TextColors
import models.aula
import org.lighthousegames.logging.logging
val clase = aula()
val txt = Terminal()
val log = logging()
fun main() {
    var eleccion = 0
    println(clase.buscarNulos())

    do {
        println("1. Agregar\n 2. Ver\n 3. Actualuzar\n 4. Borrar\n 5.Salir")
        eleccion = readln().toIntOrNull()?:5
        when(eleccion){
            1 -> agregar()

        }

    }while (eleccion != 5)
}

fun agregar() {
    TODO("Not yet implemented")
}
