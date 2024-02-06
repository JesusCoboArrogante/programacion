fun main(args: Array<String>) {
    var cadenaUno = " "
    var cadenaDos = " "
    println("introduce una frase")
    cadenaUno = readln()
    println("introduce otra frase")
    cadenaDos = readln()

    cadena(cadenaUno,cadenaDos)

}

fun cadena(cadenaUno: String, cadenaDos: String) {
        if (cadenaUno == cadenaDos){
            println("son iguales")

        }else{
            println("no son iguales")

        }
}
