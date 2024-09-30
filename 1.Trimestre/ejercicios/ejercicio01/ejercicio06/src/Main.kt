import kotlin.math.sqrt

fun main() {
    var numero: Double = 0.0

    println("introduce un numero")
    numero = readln().toDouble()

    if (numero < 0.0){
        println("la funcion no se puede completrar")
    }else{
        println(sqrt(numero))

    }
}