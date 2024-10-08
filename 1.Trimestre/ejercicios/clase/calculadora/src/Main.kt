import java.time.temporal.ValueRange

fun main() {

    var numeroUno: Int = entrada("Introduce el 1º numero")
    var numeroDos: Int = entrada("introduce el 2º numerp")
    val signo: String = simbolo("introduce un de estos simbolos(+, -, * o /)")
    calculadora(signo, numeroUno,numeroDos)







}


fun entrada(cadena:String):Int{
    var numero: Int = 0
    var inPutSalida: Boolean = false
    do {
        println("introduce el  numero")
        numero = readln().toIntOrNull()?: Int.MIN_VALUE

        if (numero > 0){
            inPutSalida = true
        }else{
            println("el numero debe ser mayor 0")
        }


    }while (!inPutSalida)

    return numero
}

fun  simbolo(cadena: String): String{
    var simbolo: String = " "
    var inPutSalida: Boolean = false
    do {
        println("introduce uno de estos simbolos")
        simbolo = readln()
        if (simbolo == "+" || simbolo == "-" || simbolo == "*" || simbolo == "/"){
            inPutSalida = true
        }else{
            println("simbolo incorrecto")

        }
    }while (!inPutSalida)
    return simbolo
}

fun calculadora(signo: String, numeroUno:Int, numeroDos: Int){

    if (signo == "+" ){
            miSuma(numeroUno,numeroDos)
    }else if (signo == "-"){
        miResta(numeroUno,numeroDos)
    }else if (signo == "*"){
        miMultiplicar(numeroUno, numeroDos)
    }else if (signo == "/"){
        miDividir(numeroUno, numeroDos)
    }


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
