package org.example
const val encontrar = 50
const val coger = 50

fun main() {
    var iniTime = 0L //borrar al acabar
    var finTime = 0L // borrar al acabar
    val vector = IntArray (10)
    var fintiempo = 30_000
    var numero = 0
    var bolsa = 0

    val vuelta = 1000
    var direction = true






    iniTime = System.currentTimeMillis()

    do {

        do {
            bolsa =funDerecha(vector,bolsa)
            println()
            Thread.sleep(100)
            numero+=100
        }while (numero < vuelta)

        numero += 1000
        Thread.sleep(1000)
     }while (numero< fintiempo)
     finTime = System.currentTimeMillis()
     println(bolsa)
    println(finTime-iniTime)







}

fun funDerecha(vector: IntArray, bolsa: Int ): Int {
    var almacenar = 0
    var bolsa = 0

    for (i in vector.indices){
        almacenar = funPremio()
        vector[i] = almacenar
        bolsa += almacenar
        print("(${vector[i]})")
        Thread.sleep(200)
    }
    return bolsa

}



fun funPremio(): Int {
    var piedra = (1..20).random()
    if (encontrar > (1..100).random()){
            piedra = funCoger(piedra)
        }else{
            piedra = 0
        }
    return  piedra
}

fun funCoger(piedra: Int): Int {
    if (coger > (1..100).random()){

    }
}


