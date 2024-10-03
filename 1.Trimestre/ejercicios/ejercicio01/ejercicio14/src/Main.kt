fun main() {
    var numero: Int = 0
    var suma: Int = 1
    var cifraPositiva: Int = 10
    var cifraNegativa: Int = 100000
    var resta: Int = 5

    var inPutSalida: Boolean = false
    println("introduce un numero")
    numero = readln().toInt()

    do {
        /*if (numero < cifraPositiva && numero >=0 ){
            println("$numero tiene suma")
            inPutSalida = true
        }else if(numero > 0){
            cifraPositiva*=10
            suma++
        }*/

        if (numero < cifraNegativa && numero < 0 ){
            println("$numero tiene $resta")
            inPutSalida = true
        }else{
            cifraNegativa/=10
            resta--

        }
    }while (!inPutSalida)
}