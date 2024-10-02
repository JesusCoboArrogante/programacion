fun main() {
    var dividendo :Int = 0
    var divisor: Int = 0
    var resto: Int = 0
    var contador: Int = 0
    var inPutDivision: Boolean = false

    do {
        println("introduce el dividendo")
        dividendo = readln().toIntOrNull()?:0
        if (dividendo > 0){
            inPutDivision = true
        }else{
            println("el dividendo debe ser mayor que 0")
        }
    }while (!inPutDivision)

    inPutDivision = false

    do {
        println("introduce el divisor")
        divisor = readln().toIntOrNull()?:0
        if (divisor <= dividendo){
            inPutDivision = true
        }else{
            println("el divisor debe ser menor que el divisor")
        }
    }while (!inPutDivision)


     resto = dividendo
    do {
        println(resto)
        resto -=  divisor
        contador++

    }while (resto >= divisor)
    println(resto)
    println("el resto es $resto y el cociente es $contador")

}