fun main() {
    val numero:Int = 0
    val parejas :Int = 50
    funPrimoGemelo(numero, parejas)
}

fun funPrimo(numero:Int):Boolean{
    var contador = 0
    var primo = false
    for (i in 1..numero){
        if (numero % 2 == 0){

        }else if (numero % i == 0){
            contador++
        }

    }

    if (contador == 2){
        primo = true
    }
    return primo
}

fun  funPrimoGemelo( numero: Int, pareja:Int){
    var contador = 0
    var numeroUno:Int = numero
    var numeroDos:Int = numeroUno + 2

    while (contador < pareja){

        if (funPrimo(numeroDos) && funPrimo(numeroUno )){
            contador++
            println("$contador. $numeroUno y $numeroDos son primos" )

        }
        numeroUno++
        numeroDos++
    }

}

