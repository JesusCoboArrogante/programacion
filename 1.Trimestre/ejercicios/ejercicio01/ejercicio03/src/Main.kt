fun main() {
    val PI: Double = 3.141592653589793
    var radio:Int = 0

    println("introduce el radio")
    radio = readln().toInt()

    val area:Double = PI * (radio * radio)
    val circuferencia: Double = 2 * PI * radio

    val areaRedondeada: Double = (area * 100).toInt() / 100.0
    val circuferenciaRedondeada: Double = (circuferencia * 100).toInt() / 100.0


    println("el area es $areaRedondeada y la circuferencia es $circuferenciaRedondeada ")
}