import com.github.ajalt.mordant.rendering.TextColors
import com.github.ajalt.mordant.terminal.Terminal
import org.lighthousegames.logging.logging
val log = logging()
val text = Terminal()

fun main() {
    /**
     * hola mundo
     */
    holaMundo()

    log.info { "hola mundo" }


}

/**
 * funcion de hola mundo
 * @param prinltn hola mundi
 */
fun holaMundo() {
    println(TextColors.red("hellow world"))
}
