fun main() {
    var lado: Int = 0

    println("dame un lado del cuadrado")
    lado = readln().toInt()

    val perimetro: Int = lado * 4
    val superficie: Int = lado * lado

    println("el perimetro es $perimetro y la superficie es $superficie y el lado es $lado")
}