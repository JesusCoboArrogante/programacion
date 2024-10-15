fun main() {
    var numero: Int = 0

    println("introduce un año")
    numero = readln().toInt()

    if ((numero % 4 == 0 && numero % 100 != 0) || (numero % 400 == 0)){
        println("es bisiesto")
    }else {
        println("no es bisiesto")
    }
}