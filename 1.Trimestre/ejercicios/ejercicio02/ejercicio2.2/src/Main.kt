fun main() {
    var domador: String = ""
    var conductor: String = ""
    var propietario: String = ""
    var puntos:Int = 0
    println("rellene las cuestiones para contratar el seguro")

    println("¿quien es el domador del seguro?")
    domador = readln()

    println("¿quien es el conductor?")
    conductor = readln()

    println("¿quien es el propietario?")
    propietario = readln()

    println("¿cuantos puntos tiene?")
    puntos = readln().toInt()

    println("para quedar todo claro el domador es $domador, el conductor es $conductor, el propietario es $propietario y tiene $puntos puntos")
}