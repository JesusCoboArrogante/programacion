fun main() {
    var grados: Double = 0.0
    var inPutGrados: Boolean = false

    do {
        println("introduce los grados")
        grados = readln().toDoubleOrNull()?: Double.NaN
        if (grados.isNaN()){
            println("introduce un numero correcto")
        }else{
            inPutGrados = true
        }

    }while (!inPutGrados)

    var farenheit: Double = (grados * 9/5) + 32


    var centigrados: Double = (grados - 32) / 1.8


    println("los grados en farenheint son $farenheit")
    println("los grados en centigrados son $centigrados")
}