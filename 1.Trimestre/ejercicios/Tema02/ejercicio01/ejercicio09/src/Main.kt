fun main() {
    var numeroUno: Int = 0
    var numeroDos: Int = 0
    var inPut: Boolean = false
    var resultado: Int = 0


    do {
        println("introduce el 1º numero")
        numeroUno = readln().toIntOrNull()?:-1

        println("introduce el 2º numero")
        numeroDos = readln().toIntOrNull()?:-1

        if (numeroUno >= 0 && numeroDos >=0){
            println("datos correcto")
            inPut = true
        }else{
            println("datos incorrectos")
        }
    }while (!inPut)

    if (numeroUno == numeroDos){
        println("los numero son igual, no hay mayor y el resultado da 0")
    }else if (numeroUno > numeroDos){
        resultado = numeroUno - numeroDos

        println("el numero mayor es el $numeroUno y la resta da $resultado")
    }else{
        resultado = numeroDos - numeroUno

        println("el numero mayor es el $numeroDos y la resta da $resultado")
    }
}