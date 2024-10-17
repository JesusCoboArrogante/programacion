fun main() {
    var suma = 0
    var cantidad = 10
    for (i in 1..cantidad){
        var numero = funComprovar("introduce diez numeros")
        suma += numero


    }
    suma/=cantidad
    println(suma)


}

fun funComprovar(mensaje:String):Int{
    var numero = 0
    var inPutSalida = false

    do {
        println(mensaje)
        numero = readln().toIntOrNull()?:-1
        if (numero > 0){
            inPutSalida = true
        }else{
            println("debe ser mayor a cero")
        }
    }while (!inPutSalida)

    return numero
}

