fun main (){
    var numeroUno: Int = entrada("introduce un numero")
    var numeroDos: Int = entrada("introduce un numero")
    mayor(numeroUno,numeroDos)



}
    fun entrada(cadena:String):Int{
        var numero: Int = 0
        var inPutSalida: Boolean = false
        do {
            println(cadena)
            numero = readln().toIntOrNull()?: Int.MIN_VALUE

            if (numero >= 0){
                inPutSalida = true
            }else{
                println("el numero debe ser mayor o igual a 0")
            }


        }while (!inPutSalida)

        return numero
    }

fun mayor(numeroUno: Int, numeroDOS: Int){

        if (numeroUno < numeroDOS){
            SumaImpares(numeroUno,numeroDOS)

        }else{

            SumaImpares(numeroDOS,numeroUno)
        }


}

fun SumaImpares(numeroUno:Int, numeroDOS:Int){
    var resultado: Int = 0

    for (i in numeroUno ..numeroDOS){
        if (i % 2 !=0){

            resultado+=i


        }

    }
    println("$resultado")



}