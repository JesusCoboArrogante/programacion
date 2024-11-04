
package org.example

import org.example.funcionDni.*
import org.example.funciones.funComprobarLetraPasaporte
import org.example.funciones.funComprobarnumero
import org.example.funciones.funTransformarletra
import org.example.funciones.funUnirNumeros

/**
 * @author Jesus Cobo
 */
fun main() {
    var numero = false
    var letra = false
    var elecion = 0
    val regexElecion = "(1|2)".toRegex()
    var salid = false
    var numeroDni = 0
    var letraDni = ' '
    var letraNumero =" "
    var salidaEmergencia = 0
    var numeroCompleto = 0

    do {
        println("como quieres comprobar el dni" + "\npulsa 1 si quieres en en modo dificil  o 2 si lo quiere en expresion regular")
        elecion = readln().toIntOrNull()?:0
        if (regexElecion.matches(elecion.toString())){
            println("eleccion correcta")
            salid = true
        }

    }while(!salid)
    salid = false



    do {
        println("introduce el DNI")
        var dni = readln().uppercase()
        println("introduce pasaporte")
        var pasaporte = readln().uppercase()


        if (elecion == 1) {
            numero = funComprobarNumeroDni(dni)
            letra = funComprobarLetraDni(dni, numero)
            if (numero &&letra) {
                println("secuencia de numeros y letras del $dni es correcta")

                numeroDni = funTransformarDniNumerico(dni)
                letraDni = funDividirNumero(numeroDni)
                salid = funComprobaLetra(letraDni,dni)

            }else{
                println("el DNI $dni no es correcto")
            }

            letra = false
            numero = false

            letra = funComprobarLetraPasaporte(pasaporte)
            numero = funComprobarnumero(pasaporte,letra)



            if (letra && numero){
                letraNumero = funTransformarletra(pasaporte)
                numeroCompleto = funUnirNumeros(pasaporte,letraNumero)
                letraDni = funDividirNumero(numeroCompleto)
                salid = funComprobaLetra(letraDni,pasaporte)
            }else{
                println("el pasaporte $pasaporte no es correcto")
            }



        } else {
            var regex = "^[0-9]{8}[^IOUÑ]".toRegex()

            if (regex.matches(dni)) {
                println("secuencia de numeros y letras del $dni es correcta")
                funTransformarDniNumerico(dni)
                letraDni = funDividirNumero(numeroDni)
                salid = funComprobaLetra(letraDni,dni)
            } else {
                println("el $dni no es correcto")
            }

            regex = "/[^IOUÑ]{3}\\d{6}\\w".toRegex()
            if (regex.matches(pasaporte)){
                letraNumero = funTransformarletra(pasaporte)

                numeroCompleto = funUnirNumeros(pasaporte,letraNumero)

                letraDni = funDividirNumero(numeroCompleto)

                salid = funComprobaLetra(letraDni,pasaporte)
            }else{
                println("el $pasaporte no es correcto")
            }



        }

        if (!salid){
            println("si no te acuerdas del DNI o Pasaporte pulsa 1 para salir")
            salidaEmergencia = readln().toIntOrNull()?:0
           if (salidaEmergencia == 1){
               salid = true
           }

        }


    }while (!salid)


}





