fun main() {
    var numero: Double = 0.0
    var inputNumero: Boolean = false

    do {

        println("introduce un numero")
        numero = readln().toDoubleOrNull()?:-1.0

        if (numero>=0 ){
            println("correcto")
            inputNumero = true
        }else{
            println("deber ser un numero mayor o igual a cero ")
        }

    }while (!inputNumero)



    val numeroSinDecimales: Int = numero.toInt()
    println(numeroSinDecimales)

    if (numeroSinDecimales < numero && (numeroSinDecimales+1) > numero){
        println("tiene decimales")
    }else{
        println("no tiene decimales")
    }
}