package org.example

import kotlin.concurrent.thread

fun main() {
    val vector = IntArray (5)
    var fintiempo = 30_000

    var iniTime = 0L

    var finTime:Long

    do {
        iniTime = System.currentTimeMillis()

         finTime = System.currentTimeMillis()
        println(iniTime - finTime)
    }while (iniTime - fintiempo < 1000)

            println(iniTime - finTime)



   var numero = 0

   do {
       println(numero)



    numero += 1000


    if (numero>= 1000){

       }
       Thread.sleep(1000)
    }while (numero< fintiempo)


}




