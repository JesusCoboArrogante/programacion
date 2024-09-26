fun main() {
    var numero: Int =0
    println("dime el numero que quieras averiguar si es par o impar")
    numero = readln().toInt()

    if (numero % 2 == 0 ){
        println("es par")
    }else{
        println("es impar")
    }

}