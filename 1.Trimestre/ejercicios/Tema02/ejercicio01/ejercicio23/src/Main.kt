fun main() {
    var numero = funverificar("introduce un numero")
    funFactorial(numero)


}

fun funverificar (mensaje:String):Int{
    var numero = 0
    var inPutSalida = true

    do {
        println(mensaje)
        numero =  readln().toIntOrNull()?:-1
        if (numero > 0){
            inPutSalida = true
        }else{
            println("el numero debe ser mayor a 0")
        }
    }while (!inPutSalida)
    return numero
}

fun funFactorial(numero:Int){
    var resultado = 1
    for (i in 1.. numero){
        resultado*=i

    }
    println(resultado)
}