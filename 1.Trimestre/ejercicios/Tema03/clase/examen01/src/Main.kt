package org.example

const val encontrar = 50
const val coger = 50
const val vuelta = 1000
const val cambio = 30

fun main() {
    var iniTime = 0L //borrar al acabar
    var finTime = 0L // borrar al acabar
    val vector = IntArray (10)

    var fintiempo = 30_000
    var numero = 0
    var bolsa = 0
    val izq = 9
    val drch = 0


    var direction = false
    iniTime = System.currentTimeMillis()

     do {
        numero = 0

            if (direction){
                bolsa =funDerecha(vector,bolsa, drch)


            }else{
                bolsa =funIzquierda(vector,bolsa, izq)

            }

            if (direction){
                true
            }else{
                false
            }


        numero += 1000
        Thread.sleep(1000)
     }while (numero< fintiempo)

     finTime = System.currentTimeMillis()
     println(bolsa)
     println(finTime-iniTime)

}

fun funViasualizacionInvertido(vector: IntArray, izq: Int) {
    var vectorImagen = arrayOf(" "," "," "," "," "," "," "," "," "," ")
    var indiceIzq = izq

    while (indiceIzq > 0){
        indiceIzq--

        vectorImagen[indiceIzq] = "<"

        if(indiceIzq < 9 && vector[indiceIzq+1] > 0){
            vectorImagen[indiceIzq+1]= vector[indiceIzq+1].toString()
        }else if (indiceIzq < 9 && vectorImagen[indiceIzq+1] != " "){
            vectorImagen[indiceIzq+1] = " "
        }



        funJoinToString(vectorImagen)

    }
}

fun funViasualizacionDerecha(vector: IntArray, drch: Int) {
    var vectorImagen = arrayOf(" "," "," "," "," "," "," "," "," "," ")
    var indiceDrch = drch-1
    while (indiceDrch < vector.size-1){
        indiceDrch++

        vectorImagen[indiceDrch] = ">"

        if(indiceDrch > 0 && vector[indiceDrch-1] > 0){
            vectorImagen[indiceDrch-1]= vector[indiceDrch-1].toString()
        }else if (indiceDrch > 0 && vectorImagen[indiceDrch -1] != " "){
            vectorImagen[indiceDrch-1] = " "
        }
        if (indiceDrch == 0){
            vectorImagen[9] = " "
        }

       funJoinToString(vectorImagen)

    }





}

fun funJoinToString(vectorImagen: Array<String>) {
    var union = ""
    for (i in vectorImagen.indices){
        union+="[${vectorImagen[i]}]"
    }
    println(union)
}


fun funIzquierda(vector: IntArray, bolsa: Int, izq: Int): Int {
    var direction = false
    var almacenar = 0
    var numero =0
    var bolsa = bolsa
    var indiceizq = izq


    do {
        do {
            almacenar = funPremio()
            vector[indiceizq] = almacenar
            bolsa += almacenar


            funViasualizacionInvertido(vector, izq)

            Thread.sleep(100)
            numero+=100
            indiceizq --
        }while(indiceizq != 1)




    }while (numero < vuelta)
    if (numero >= vuelta){
        funCambio(direction,izq,bolsa,vector)
    }


    return bolsa
}

fun funCambio(direction: Boolean, lado: Int, bolsa: Int, vector: IntArray) {
    if (cambio < (1..100).random()){
        if (direction){
            println("media vuelta")
            funIzquierda(vector,bolsa,lado)
        }else{
            println("media vuelta")
            funDerecha(vector,bolsa,lado)
        }
    }
    if (direction){
        println("sigue con tu trabajo")
        funDerecha(vector,bolsa,lado)
    }else{
        println("sigue con tu trabajo")
        funIzquierda(vector,bolsa,lado)
    }
}




fun funDerecha(vector: IntArray, bolsa: Int, drch: Int): Int {
    val direction = true
    var almacenar = 0
    var bolsa = bolsa
    var indiceDrch = drch
    var numero = 0


        do {
            almacenar = funPremio()
            vector[indiceDrch] = almacenar
            bolsa += almacenar


            funViasualizacionDerecha(vector, drch)


            Thread.sleep(100)
            numero+=100
            indiceDrch ++
            println(numero)
            println(indiceDrch)
        }while(indiceDrch < vector.size-1 || numero > vuelta)
        println("sañida1")

    if (numero >= vuelta){
        funCambio(direction,drch,bolsa,vector)
    }
    println("salida2")

    return bolsa

}



fun funPremio(): Int {
    var piedra = (1..20).random()
    if (encontrar < (1..100).random()){
            piedra = funCoger(piedra)
        }else{
            piedra = 0
        }
    return  piedra
}

fun funCoger(piedra: Int): Int {
    var piedra01 = piedra
    if (coger < (1..100).random()){
          piedra01
    }else{
        piedra01 = 0
    }
    return piedra01
}


