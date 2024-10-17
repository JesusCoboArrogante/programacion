fun main() {
    var numero = 0

    do {
        println("introduce un numero")
        numero = readln().toInt()
    }while (numero > 5 || numero <= 0)
}