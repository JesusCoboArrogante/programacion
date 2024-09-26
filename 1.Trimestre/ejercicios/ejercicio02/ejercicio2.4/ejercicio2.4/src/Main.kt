fun main() {
    var dni: String = ""
    var direccion: String = ""
    var cp : Int = 0
    var movil: Int = 0

    println("¿cual es tu dni?")
    dni = readln()

    println("¿cual es tu direccion?")
    direccion = readln()

    println("¿cual es tu codigo postal?")
    cp = readln().toInt()

    println("¿cual es tu telefono movil?")
    movil = readln().toInt()

    println("tu dni es $dni, tu dirreccion es $direccion, el codigo postal es $cp y tu telefono movil es $movil")

}