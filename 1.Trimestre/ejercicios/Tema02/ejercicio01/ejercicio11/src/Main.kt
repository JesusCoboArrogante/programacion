fun main() {
    var numeroUno: Int = 0
    var numeroDos: Int = 0
    var numeroTres: Int = 0

    var inPutNumero: Boolean = false

    do {
        println("introduce el 1º numero")
        numeroUno = readln().toIntOrNull() ?: -1
        if (numeroUno >= 0 ) {
            inPutNumero = true
        }else {
            println("el 1º numero es incorrecto")
        }
    } while (!inPutNumero)

    do {
        inPutNumero = false
        println("introduce el 2º numero")
        numeroDos = readln().toIntOrNull() ?: -1
        if (numeroDos >= 0 && numeroDos != numeroUno) {
            inPutNumero = true
        }else {
            println("el 2º numero es incorrecto")
        }
    } while (!inPutNumero)

    do {
        inPutNumero = false
        println("introduce el 3º numero")
        numeroTres = readln().toIntOrNull() ?: -1
        if (numeroTres >= 0  && numeroTres != numeroDos && numeroTres != numeroUno) {
            inPutNumero = true
        }else {
            println("el 3º numero es incorrecto")
        }
    } while (!inPutNumero)

   if (numeroUno <  numeroDos && numeroUno < numeroTres ){
       println("estan ordenados de menor a mayor")
   }else{
       println("no estan ordenados de menor a mayor ")
   }






}