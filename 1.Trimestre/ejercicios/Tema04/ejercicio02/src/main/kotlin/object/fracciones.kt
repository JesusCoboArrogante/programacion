package org.example.`object`

import org.lighthousegames.logging.logging
import kotlin.concurrent.thread

val log = logging()
class fracciones(
    var numerador: Int,
    var denominador:Int= 2
    ) {
    val francion:String
        get() = "$numerador|$denominador"

    override fun toString(): String {

        return " la fraccion es $francion"
    }

    fun sumar(numeradorA: Int, denominadorA: Int, numeradorB: Int, denominadorB: Int) {
        numerador = (numeradorA * denominadorB) + (denominadorA * numeradorB)
        denominador = denominadorA * denominadorB
    }

    fun multiplicar(numeradorA: Int, denominadorA: Int, numeradorB: Int, denominadorB: Int) {
        numerador = numeradorA * numeradorB
        denominador = denominadorA * denominadorB
    }

    fun simplificar(numerador: Int, denominador: Int){
        var nume = numerador
        var deno = denominador
        var entrada = false
        var numero = 2

        do {
            entrada = numeroPrimero(numero)

                if( entrada){
                    do {
                        if (nume % numero == 0 && deno % numero == 0){
                            nume /= numero
                            deno /= numero
                        }
                    }while (nume % numero == 0 && deno % numero == 0)
                    
                }

            numero++


        }while (nume  >= numero)

        this.numerador = nume
        this.denominador = deno

    }

    private fun numeroPrimero(numero: Int): Boolean {

        var divisor = 1
        var contador = 0
        var entrada = false
        do {
            if (numero % divisor == 0 && numero % 2 != 0){

                contador++
            }
            divisor++
        }while(numero >= divisor )

        if (contador == 2 || numero == 2){
            entrada = true
        }
        return entrada

    }
}