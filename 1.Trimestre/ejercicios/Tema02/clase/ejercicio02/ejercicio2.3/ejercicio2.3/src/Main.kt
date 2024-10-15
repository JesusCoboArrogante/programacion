fun main() {
    var fallecimiento: Int = 0
    var anillos: Int = 0
    var oscuro: String = ""
    var gandalf: String = ""

    println("¿En que año fallecio Tolkien?")
    fallecimiento = readln().toInt()

    println("¿cuantos anillos habia?")
    anillos = readln().toInt()

    println("¿cual es el señor oscuro mas poderoso?")
    oscuro = readln()

    println("¿de que raza es gandalf?")
    gandalf = readln()

    println("tus respuestas son $fallecimiento, $anillos, $oscuro, $gandalf")

}