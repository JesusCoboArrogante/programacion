package org.example
import org.lighthousegames.logging.logging

const val VACIO = 0
const val DARYL = 1
const val ZOMBIE = 2
const val MURO = 3
const val SALUD = 4
const val MAX_ZOMBIE = 5
const val MAX_MURO = 10
const val MAX_SALUD = 3
const val TAMAYO = 5
const val MAX_VIDA = 10
const val MAX_MUNICION = 10
const val POSITION_ZOMBIE = 0
const val POSITION_VIDA = 1
const val POSITION_MUNICION = 2
const val MAX_TIEMPO = 30_000
val logger = logging()

fun main() {
    val alexandria = Array(TAMAYO){IntArray(TAMAYO)}
    val conteo = arrayOf(0, MAX_VIDA, MAX_MUNICION)

    llenarAlexandria(alexandria)
    imprimirAlexandria(alexandria)
    Thread.sleep(1000)
    simularJuego(alexandria, conteo)
    hacerInforme(conteo, alexandria)

}

/**
 * Es una funcion para crear el informe final de la simulacion
 * @param conteo es para almacenar la información índice 0 los zombies rematados, 1 la vida y 2 municion
 * @param alexandria
 */
fun hacerInforme(conteo: Array<Int>, alexandria: Array<IntArray>) {
    if (alexandria[4][4] == DARYL){
        println("has conseguido escapar")
    }
    println("Muertes de Zombies ${conteo[POSITION_ZOMBIE]}")
    println("vida ${conteo[POSITION_VIDA]}")
    println("Municion ${conteo[POSITION_MUNICION]}")

}

/**
 * Donde se realiza la simulacion
 * @param alexandria
 * @param conteo
 */
fun simularJuego(alexandria: Array<IntArray>, conteo: Array<Int>) {
    var tiempoSalida = 0
    var contadorZombie = 0
    val copyBuffer = alexandria.copyOf()
    val inicio = System.currentTimeMillis()
    do {
        for (i in alexandria.indices){
            for (j in alexandria.indices){

                if (alexandria[i][j] == DARYL){
                    irNuevaPosicion(i,j,copyBuffer,alexandria, conteo)
                    imprimirAlexandria(alexandria)
                }
                if (contadorZombie == 5){
                    colocacion(1, ZOMBIE,alexandria)
                    conteo[POSITION_ZOMBIE]+=1
                    contadorZombie = 0
                    println("zombie nuevo")

                }
            }

        }
        copiarBuffer(alexandria,copyBuffer)

        val fin = System.currentTimeMillis()

        println(fin -inicio)

        Thread.sleep(1000)
        tiempoSalida+=1000
        contadorZombie++
    }while (conteo[POSITION_VIDA] != 0 && alexandria[4][4] != DARYL && tiempoSalida < MAX_TIEMPO)




}

/**
 * Copia toda la información el buffer en la matriz original
 * @param alexandria matriz original
 * @param copyBuffer
 */
fun copiarBuffer(alexandria: Array<IntArray>, copyBuffer: Array<IntArray>) {
    for (i in alexandria.indices){
        for (j in alexandria.indices){
            alexandria[i][j]= copyBuffer[i][j]
        }
    }
}

/**
 * Si DARYL está en el borde del mapa se cambia la posicion dependiendo donde este
 * @param posicion puede ser fila o culumna
 */
fun moverlimite(posicion: Int): Int {
    var ubicacion = posicion
    when (posicion){
        0 -> {
            ubicacion+=1
        }
        4 -> {
            ubicacion-=1
        }
    }
    return ubicacion
}

/**
 * Verifica que hay en la position donde se va a mover Daryl y dependiendo de lo que haya realiza la accion
 * @param i
 * @param j
 * @param copyBuffer
 * @param alexandria
 * @param conteo
 */
fun irNuevaPosicion(i: Int, j: Int, copyBuffer: Array<IntArray>, alexandria: Array<IntArray>, conteo: Array<Int>) {
    var salida = false
    var fila:Int
    var columna:Int
    var nf:Int
    var nc:Int


    do {
        fila = (-1..1).random() + i
        columna = (-1..1).random() + j

        if (comprobarPosicion(fila,columna)){

            if (alexandria[fila][columna]== VACIO){
                moverDarly(fila,columna,i,j,copyBuffer)
                salida = true
            }else if (alexandria[fila][columna]== ZOMBIE){
                encuentroZombie(conteo)
                moverDarly(fila, columna, i, j, copyBuffer)
                salida = true
            }else if (alexandria[fila][columna]== MURO){
                if (conteo[POSITION_MUNICION] > 2){
                    conteo[POSITION_MUNICION] -= 2
                    logger.info {"Menos 2 municion ${conteo[POSITION_MUNICION]}"}
                    moverDarly(fila, columna, i, j, copyBuffer)
                    salida = true
                }
            }else if (alexandria[fila][columna]== SALUD){
                moverDarly(fila,columna,i,j,copyBuffer)
                conteo[POSITION_VIDA]+=1
                logger.info {"Mas 1 vida ${conteo[POSITION_VIDA]}"}
                salida = true

            }

            if (copyBuffer[4][4]!= DARYL){
                if (fila == 0 || fila == 4 || columna == 0 || columna ==4){
                   nf = moverlimite (fila)
                    nc = moverlimite(columna)
                    moverDarly(nf, nc, fila, columna, copyBuffer)
                }
            }

        }

    }while (!salida)

}

/**
 * Si se encuentra con un zombie saber que accion  realizar
 * @param conteo
 */
fun encuentroZombie(conteo: Array<Int>) {

    if (50 > (0..100).random()){
        conteo[POSITION_VIDA] -=1
        logger.info {"Menos 1 vida ${conteo[POSITION_VIDA]}"}


    }
    if (conteo[POSITION_MUNICION] > 0){
        logger.info {"Menos 1 bala ${conteo[POSITION_MUNICION]}"}
        conteo[POSITION_MUNICION] -=1
        conteo[POSITION_ZOMBIE] += 1
    }else{
        conteo[POSITION_VIDA]-=2
        logger.info {"Menos 2 vida ${conteo[POSITION_VIDA]}"}
        conteo[POSITION_ZOMBIE]+=1
    }

    logger.info {"zombie muerto ${conteo[POSITION_ZOMBIE]}"}


}

/**
 * Mueve a Daryl a una nueva posicion y pone a 0 su antigua posicion
 * @param i la antigua fila
 * @param j la antigua columna
 * @param fila la nueva columna
 * @param columna la nueva columna
 * @param copyBuffer
 */
fun moverDarly(fila: Int, columna: Int, i: Int, j: Int, copyBuffer: Array<IntArray>) {
    copyBuffer[fila][columna]= DARYL
    copyBuffer[i][j] = VACIO

    logger.info {"Darly esta en la posicion $i:$j"}
    logger.info {"Darly cambia en la posicion $fila:$columna"}

}

/**
 * Verifica que a la posicion que va a ir DARLY está dentro del rango de la matriz
 * @param fila
 * @param columna
 */
fun comprobarPosicion(fila: Int, columna: Int): Boolean {
    return fila in 0 ..< TAMAYO && columna in 0 ..< TAMAYO
}


fun imprimirAlexandria(alexandria: Array<IntArray>) {
    val alenjandriaDos = Array(TAMAYO){Array(TAMAYO){"🍀"} }
    for (i in alenjandriaDos.indices){
        for (j in alenjandriaDos.indices){
            when(alexandria[i][j]){
                ZOMBIE ->alenjandriaDos[i][j] = "🧟‍♂️"
                SALUD -> alenjandriaDos[i][j] = "🫀"
                DARYL -> alenjandriaDos[i][j] = "🕵️‍♂️"
                MURO -> alenjandriaDos[i][j] = "🧱"
            }
            print(alenjandriaDos[i][j])
        }
        println()
    }
    println()
}

/**
 * Es para saber qué colocar en la matriz y cuantas veces
 * @param alexandria
 */
fun llenarAlexandria(alexandria: Array<IntArray>) {

    colocacion(1, DARYL,alexandria)
    colocacion(MAX_ZOMBIE, ZOMBIE, alexandria)
    colocacion(MAX_MURO, MURO,alexandria)
    colocacion(MAX_SALUD, SALUD,alexandria)

}

/**
 * Colocar en la matriz los diferentes objetos
 * @param max el numero de objetos a colocar
 * @param poner que objeto colocar
 * @param alexandria
 */
fun colocacion(max: Int, poner: Int, alexandria: Array<IntArray>) {
    var contador = 0

    do {

        val fila = (0..4).random()
        val columna = (0..4).random()
        repeat(max){
            if (alexandria[fila][columna]== VACIO){
                alexandria[fila][columna] = poner
                contador ++
            }
        }
    }while (contador != max)
}


