fun main() {
    var dividendo :Int = 0
    var divisor: Int = 0
    var resultado: Int = 0
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


     resultado = dividendo
    do {
        println(resultado)
        resultado -=  divisor
        contador++

    }while (resultado > divisor)
    println(resultado)
    println("el resto es $resultado y el cociente es $contador")

}