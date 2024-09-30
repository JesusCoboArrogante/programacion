fun main() {
    var numero: Int = 0
    println("introduce un numero")
    numero = readln().toInt()

    if (numero < 0){
        println("negativo")
    }else{
        println("positivo")
    }
}