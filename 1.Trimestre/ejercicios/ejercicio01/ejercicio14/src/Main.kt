fun main() {
    var numero: Int = 0
    var contador: Int = 1
    var cifraPositiva: Int = 10
    var cifraNegativa: Int = -10
    var inPutSalida: Boolean = false

    do {
        println("introduce un numero")
        numero = readln().toIntOrNull()?:100000
        if (numero < 100000 && numero > -100000){
            println("correcto")
            inPutSalida = true
        }else{
            println("caracter incorrecto o el numero debe ser menor a 6 cifras")
        }
    }while (!inPutSalida)

    inPutSalida = false

    do {
       if (numero < cifraPositiva && numero >=0 ){
            println("$numero tiene $contador")
            inPutSalida = true
        }else{
            cifraPositiva*=10
            contador++
        }



        if (numero > cifraNegativa && numero < 0 ){
            println("$numero tiene $contador")
            inPutSalida = true
        }else{
            cifraNegativa*=10
            contador++
        }
    }while (!inPutSalida)




}
