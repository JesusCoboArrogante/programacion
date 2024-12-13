package org.example.models

class hogwarts(tamano: Int) {
     private val enemigos = (15..25).random()
     private val castillo  = Array(tamano){Array<enemigos?>(tamano){null} }
    var id = 1

    private fun castillo(tamano: Int): Int {
        require(tamano in 5..10){"debe ser entre 5 y 10"}
        return tamano
    }
     fun generarEnemigo(generar: enemigos?) {

        for (i in castillo.indices){
            for (j in castillo.indices){
                if (castillo[i][j] == null){
                    castillo[i][j] = generar?.copy(id = id)
                    id++
                }
            }
        }

    }
    fun imprimir(){
        for (i in castillo.indices){
            for (j in castillo.indices){
                print(castillo[i][j])
            }
            println()
        }

    }






}