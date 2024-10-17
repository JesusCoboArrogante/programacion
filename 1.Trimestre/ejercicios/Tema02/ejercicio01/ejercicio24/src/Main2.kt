fun main() {
    var suma = 0
    var cantidad = funComprovar("cuantas veces quiere que se repita")
    var contador = 0
    var numero = 0

    do {
            println("introduce un numero")
            numero = readln().toInt()
            if (numero > 0){
                suma += numero
                contador++
                cantidad--
            }
        

    }while (numero > 0 && cantidad > 0)


    var resultado = suma / contador
    println("$suma / $contador es $resultado")


}

