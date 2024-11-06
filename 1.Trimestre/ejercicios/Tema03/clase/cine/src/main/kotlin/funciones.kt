package org.example

/**
 * Se calcula la recaudancion total
 * @param precio
 * @param cine
 * @param asientos
 */
fun calculaRecudacionTotal(precio: Double, cine: Array<Array<String>>, asientos: Int) {
    var asientos = asientos
    asientos = contarAsientos(cine)- asientos
    println(asientos)
    var caja = asientos * precio
    println(caja)

}

/**
 * Seleccionamos la ubicacion del asiento que hemos elegido antes y compara que sea nuestro asiento
 * @param vectorGuardar
 * @param cine
 */
fun devolverEntrada(vectorGuardar: Array<IntArray>, cine: Array<Array<String>>) {
    var salida = false
    var mostrar = 0
    if (vectorGuardar[0][0] != 0){
        do {
            val asiento = asignarAsiento()
            var fila:String = asiento.substring(0, 1)
            val columna = asiento.substring(2)

            fila = letraNumero(fila)


            for (f in vectorGuardar.indices){
                for (c in vectorGuardar[f].indices){
                    if (vectorGuardar[0][c] == fila.toInt() && vectorGuardar[1][c] == columna.toInt()){
                        cine[fila.toInt()][columna.toInt()] = "[ ]"
                        salida = true

                    }else{
                        if (mostrar > 0 ){
                            println("error seleccion")
                            mostrar++
                        }

                    }
                }
            }

        }while (!salida)
    }else{
        println("no has comprado entradas")
    }




}

/**
 * Seleccionamos el asiento que querremos
 * @param cine
 * @param vectorGuardar
 * @param entradas
 */
fun seleccionarButacas(cine: Array<Array<String>>, vectorGuardar: Array<IntArray>, entradas: Int) {
    for (i in 1..entradas){
        var salida = false
        do {
            val asiento = asignarAsiento()
            var fila:String = asiento.substring(0,1)
            val columna = asiento.substring(2)

            fila = letraNumero(fila)

            if (cine[fila.toInt()][columna.toInt()] == "[ ]"){
                cine[fila.toInt()][columna.toInt()] = "[X]"
                guardarPosicion(vectorGuardar, fila, columna)
                salida = true

            }else{
                println("el asiento esta ocupado")
            }

        }while (!salida)

    }


}

/**
 * verifica la cadena
 * @return butaca
 */
fun asignarAsiento(): String {
    var salida = false
    var butaca = ""
    do {
        val regex = "^[A-E]-[1-5]$".toRegex()
        println("introduce la butaca")
        butaca = readln().uppercase()
        if (regex.matches(butaca)){
            salida = true
        }else{
            println("numero de butaca erroneo")
        }
    }while (!salida)

    return butaca

}

/**
 * Guarda la posición que hemos seleccionado a la hora de elegir asiento
 * @param vectorGuardar
 * @param fila
 * @param columna
 */

fun guardarPosicion(vectorGuardar: Array<IntArray>, fila: String, columna: String) {


    for (f in fila.indices){
        for (c in vectorGuardar[f].indices){
            if (vectorGuardar[f][c] == 0){
                vectorGuardar[0][c] = fila.toInt() //error
                vectorGuardar[1][c] = columna.toInt()
            }

        }
    }



}

/**
 * Transforma la letra que hemos introduction que sería la fila en numero
 * @param fila
 */
fun letraNumero(fila: String): String {
    var letra = fila
    when(fila){
        "A"-> letra = "1"
        "B"-> letra = "2"
        "C"-> letra = "3"
        "D"-> letra = "4"
        "E"-> letra = "5"


    }
    return  letra
}





/**
 * Comprueba que el numero de asientos sea menor a las entradas compradas
 * retur ticket
 */
fun comprobrarEntradasAsientos(entradas: Int, asientos: Int): Int {
    var ticket = entradas
    var inPutSalida = false
    do {
        if (ticket > asientos){
            println("lo sentimos el numero de entradas $ticket sobre pasa el numero de asientos $asientos")
            println("cuantas entradas quieres")
            ticket = readln().toIntOrNull()?:1
        }else{
            inPutSalida = true
        }
    }while (!inPutSalida)
    return ticket

}

/**
 * Cuenta el número de asientos libres que hay
 * @param cine
 */
fun contarAsientos(cine: Array<Array<String>>): Int {
    var asientos = 0

    for (i in cine.indices){
        for (j in cine[i].indices){
            if (cine[i][j] == "[ ]"){
                asientos++
            }
        }
    }

    return asientos
}

/**
 * En la fila 0 pone numeros del 1 hasta lo larga que sea la matriz y la columna 0 igual pero con letras empezansdo por la A
 * @param cine
 */
fun generarAlfanumerico(cine: Array<Array<String>>) {
    var letra = 'A'
    var numero = 1
    for (i in cine.indices){
        for (j in cine[i].indices){
            if (cine[0][j] == "[ ]"){
                cine [0][j] = "[$numero]"
                numero++
            }
            if (cine[i][0] == "[ ]"){
                cine [i][0] = "[$letra]"
                letra++
            }



        }

    }
}


/**
 * Imprime la matriz
 * @param cine
 */
fun funImprimirCine(cine: Array<Array<String>>) {
    for (i in cine.indices){
        for (j in cine[i].indices){
            print("${cine[i][j]}")
        }
        println()
    }
}

/**
 * Esta funcion marca con una X las casillas ocupadas hay un 30% de que la casilla sea ocupada
 * @param cine
 */
fun sentarGente(cine: Array<Array<String>>) {
    for (i in cine.indices){
        for (j in cine[i].indices){
            if (cine[i][j] == "[ ]"){
                if (30 > (1..100).random()){
                    cine[i][j] = "[X]"
                }
            }

        }
    }
}

/**
 * Aqui se crea el menu
 * @param cine
 * @param vectorGuardar
 * @param entradas
 * @param asientos
 */
fun crearMenu(cine: Array<Array<String>>, vectorGuardar: Array<IntArray>, entradas: Int, asientos: Int) {
    var opcion = 0

    do {
        println("elige la opcion que quieres \n"+
                "1 Mostrar sala \n"+
                "2 Comprar entrada \n"+
                "3 Devolver entrada \n"+
                "4 Recaudacion total \n"+
                "5 salir")
        opcion = readln().toIntOrNull()?:0

        when(opcion){
            1 -> funImprimirCine(cine)
            2 -> seleccionarButacas(cine,vectorGuardar,entradas)
            3 -> devolverEntrada(vectorGuardar,cine)
            4 -> calculaRecudacionTotal(precio,cine,asientos)
            5 -> println("Adios")
        }
    }while (opcion != 5)
}