package org.example
import org.lighthousegames.logging.logging
const val VACIO = 0
const val DARYL = 1
const val ZOMBIE = 2
const val MURO = 3
const val SALUD = 4
const val MUNICION = 7
const val MAX_ZOMBIE = 5
const val MAX_MURO = 10
const val MAX_SALUD = 3
const val TAMAYO = 5
const val MAX_VIDA = 10
const val MAX_MUNICION = 10
const val SEGUNDA_FILA = 1
const val POSICION_ZOMBIE = 0
const val POSICION_VIDA = 1
const val POSICION_MUNICION = 3

fun main() {

    val alexandria = Array(TAMAYO){IntArray(TAMAYO)}
    val logger = logging()
    var conteo = arrayOf(arrayOf(ZOMBIE, SALUD, MUNICION), arrayOf(MAX_ZOMBIE, MAX_VIDA, MAX_MUNICION))

    llenarAlexandria(alexandria)
    imprimirAlexandria(alexandria)
    simularJuego(alexandria, conteo)

}



fun simularJuego(alexandria: Array<IntArray>, conteo: Array<Array<Int>>) {

    val copyBuffer = alexandria.copyOf()
    for (i in alexandria.indices){
        for (j in alexandria.indices){

            if (alexandria[i][j] == DARYL){
                irNuevaPosicion(i,j,copyBuffer,alexandria, conteo)

            }


        }
    }

    imprimirAlexandria(alexandria)
}

fun irNuevaPosicion(i: Int, j: Int, copyBuffer: Array<IntArray>, alexandria: Array<IntArray>, conteo: Array<Array<Int>>) {
    var salida = false
    var fila:Int
    var columna:Int




    do {
        fila = (-1..1).random() + i
        columna = (-1..1).random() + j

        if (comprobarPosicion(fila,columna)){

            if (alexandria[fila][columna]== VACIO){
                moverDarly(fila,columna,i,j,copyBuffer)
                salida = true
            }else if (alexandria[fila][columna]== ZOMBIE){
                moverDarly(fila, columna, i, j, copyBuffer)
                encuentroZombie(conteo)
                salida = true
            }else if (alexandria[fila][columna]== MURO){
                if (conteo[SEGUNDA_FILA][POSICION_MUNICION] > 2){

                    salida = true
                }
            }else if (alexandria[fila][columna]== SALUD){
                moverDarly(fila,columna,i,j,copyBuffer)
                conteo[SEGUNDA_FILA][POSICION_MUNICION]+=1

            }
        }


    }while (!salida)

}

fun encuentroZombie(conteo: Array<Array<Int>>) {

    if (50 > (0..100).random()){
        conteo[SEGUNDA_FILA][POSICION_VIDA] -=1
    }else if (conteo[SEGUNDA_FILA][POSICION_MUNICION] > 0){
        conteo[SEGUNDA_FILA][POSICION_MUNICION] -=1
        conteo[SEGUNDA_FILA][POSICION_ZOMBIE] -= 1
    }else{
        conteo[SEGUNDA_FILA][POSICION_VIDA]-=2
        conteo[SEGUNDA_FILA][POSICION_ZOMBIE]-=1
    }
}


fun moverDarly(fila: Int, columna: Int, i: Int, j: Int, copyBuffer: Array<IntArray>) {
    copyBuffer[fila][columna]= DARYL
    copyBuffer[i][j] = VACIO
}

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

fun llenarAlexandria(
    alexandria: Array<IntArray>,

) {
    var contadorZombie = 0
    var contadorMuro = 0
    var contadorSalud = 0
    var fila = (0..4).random()
    var columna = (0..4).random()


    alexandria[fila][columna] = DARYL

    do {
        fila = (0..4).random()
        columna = (0..4).random()
        repeat(MAX_ZOMBIE){
            if (alexandria[fila][columna]== VACIO){
                alexandria[fila][columna] = ZOMBIE
                contadorZombie ++
            }
        }
    }while (contadorZombie != MAX_ZOMBIE)

    do {
        fila = (0..4).random()
        columna = (0..4).random()
        repeat(MAX_MURO){
            if (alexandria[fila][columna]== 0){
                alexandria[fila][columna] = MURO
                contadorMuro ++
            }
        }
    }while (contadorMuro != MAX_MURO)

    do {
        fila = (0..4).random()
        columna = (0..4).random()
        repeat(MAX_SALUD){
            if (alexandria[fila][columna]== 0){
                alexandria[fila][columna] = SALUD
                contadorSalud ++
            }
        }
    }while (contadorSalud != MAX_SALUD)


}
