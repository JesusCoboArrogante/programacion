fun main() {
    var ancho: Int = 0
    var largo: Int = 0

    println("dame el ancho")
    ancho = readln().toInt()

    println("dame el largo")
    largo = readln().toInt()

    val perimetro: Int = (ancho + largo) * 2
    val superficie: Int = largo * ancho

    println("el perimero es $perimetro y la superficie es $superficie cm^2")

}