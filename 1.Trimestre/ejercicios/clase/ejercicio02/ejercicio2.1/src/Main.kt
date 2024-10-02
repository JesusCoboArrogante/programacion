fun main() {
    var nombre: String = ""
    var curso: Int = 0
    var titulacion: String = ""
    var modulo: String = ""

    println("como te llamas")
    nombre= readln()

    println("en que curso estas")
    curso = readln().toInt()

    println("que titulacion estas haciendo")
    titulacion = readln()

    println("en que modulo estas")
    modulo = readln()

    println("hola $nombre estas en $curso" + "º de $titulacion en $modulo ")

}