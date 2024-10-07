fun main() {

    var numeroUno: Int = entrada("Introduce el 1º numero")
    var numeroDos: Int = entrada("introduce el 2º numerp")
    val signo: Char = simbolo("introduce un de estos simbolos(+, -, * o /)")






    /*if (signo == sumar){
            miSuma(numeroUno,numeroDos)
    }else if (signo == restar){
        miResta(numeroUno,numeroDos)
    }else if (signo == multiplicar){
        miMultiplicar(numeroUno, numeroDos)
    }else if (signo == dividir){
        miDividir(numeroUno, numeroDos)
    }

     */
}


fun entrada(cadena:String):Int{
    var numero: Int = 0
    var inPutSalida: Boolean = false
    do {
        println("introduce el  numero")
        numero = readln().toIntOrNull()?: Int.MIN_VALUE

        if (numero >= 0){
            inPutSalida = true
        }else{
            println("el numero debe ser mayor o igual a 0")
        }


    }while (!inPutSalida)

    return numero
}

fun  simbolo(cadena: String): Char{
    var simbolo: Char = ' '
    var inPutSalida: Boolean = false
    do {
        println("introduce uno de estos simbolos")
        simbolo = readln()
        if (simbolo != '+' || simbolo != '-' || simbolo != '*' || simbolo != '/'){
            println("simbolo incorrecto")
        }else{
            inPutSalida = true
        }
    }while (!inPutSalida)
    return simbolo
}

fun miSuma(a:Int, b:Int){
    val resultado = a + b
    println(resultado)
}

fun miResta(a:Int, b:Int){
    val resultado = a - b
    println(resultado)
}

fun miMultiplicar(a:Int, b:Int){
    val resultado = a * b
    println(resultado)
}

fun miDividir(a:Int, b:Int){
    val resultado = a / b
    println(resultado)
}
