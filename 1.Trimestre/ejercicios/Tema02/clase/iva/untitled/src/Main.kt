fun main() {
    var precio: Double = 0.0
    val iva: Double = 1.21


    println("¿cuanto cuesta el producto?")
    precio = readln().toDouble()

    var precioFinal = precio * iva
    println("el precio final es $precioFinal")
}