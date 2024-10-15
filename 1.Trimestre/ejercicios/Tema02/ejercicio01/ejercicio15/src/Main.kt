fun main() {
    var numeroUno:Int = 0
    var numeroDos: Int = 0
    var numeroTres: Int = 0
    var inPutSalida = false
    do {
        println("introduce un numero")
        numeroUno = readln().toIntOrNull()?:-1
        if (numeroUno >= 0){
            println("1º numero correcto")
            inPutSalida = true

        }else (
            println("el  1º numero deber ser mayor o igual a 0")
        )
    }while (!inPutSalida)

    inPutSalida = false

    do {
        println("introduce un numero")
        numeroDos = readln().toIntOrNull()?:-1

        if (numeroDos >= 0){
            println("2º numero correcto")
            inPutSalida = true

        }else (
                println("el  2º numero deber ser mayor o igual a 0")
                )
    }while (!inPutSalida)

    inPutSalida = false

    do {
        println("introduce un numero")
        numeroTres = readln().toIntOrNull()?:-1
        if (numeroTres >= 0){
            println("3º numero correcto")
            inPutSalida = true

        }else (
                println("el  3º numero deber ser mayor o igual a 0")
                )
    }while (!inPutSalida)

    if (numeroUno > numeroDos && numeroUno > numeroTres){
        if (numeroDos > numeroTres){
            println("el $numeroUno es el mayor, el $numeroDos es el mediano y el $numeroTres pequeño")
        }else{
            println("el $numeroUno es el mayor, el $numeroTres es el mediano y el $numeroDos pequeño")
        }
    }

    if (numeroDos > numeroUno && numeroDos > numeroTres){
        if (numeroUno > numeroTres){
            println("el $numeroDos es el mayor, el $numeroUno es el mediano y el $numeroTres pequeño")
        }else{
            println("el $numeroDos es el mayor, el $numeroTres es el mediano y el $numeroUno pequeño")
        }
    }

    if (numeroTres > numeroUno && numeroTres > numeroDos){
        if (numeroUno > numeroDos){
            println("el $numeroTres es el mayor, el $numeroUno es el mediano y el $numeroDos pequeño")
        }else{
            println("el $numeroTres es el mayor, el $numeroDos es el mediano y el $numeroUno pequeño")
        }
    }
}