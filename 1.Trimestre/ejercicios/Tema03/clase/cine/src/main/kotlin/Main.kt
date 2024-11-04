package org.example

const val precio = 5.50




fun main(args: Array<Int>) {
    val butacas = args
    val opcion = 0
    val entradas = 0
    val caja = entradas * precio
    val vector = IntArray (2)
    val cine = arrayOf(
        arrayOf("[X]","[1]","[2]","[3]","[4]","[5]","[6]"),
        arrayOf("[A]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[B]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[C]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[D]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[E]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[X]","[X]","[P]","[P]","[P]","[X]","[X]"))

    funSentarGente(cine)

    for (i in butacas.indices){
        println(butacas[i])
    }

    when(opcion){
        //1 --> vector = funSeleccionarButaca(butacas)
    }

    //funImprimirCine(cine)


}

/*fun funSeleccionarButaca(butacas: Array<String>): IntArray {
    var numero = 0

}*/

fun funImprimirCine(cine: Array<Array<String>>) {
    for (i in cine.indices){
        for (j in cine.indices){
           print(cine[i][j])
        }
        println()
    }
}

fun funSentarGente(cine: Array<Array<String>>) {
    for (i in cine.indices){
        for (j in cine.indices){
            if (cine[i][j] == "[ ]"){
                if (27 > (1..100).random()){
                    cine[i][j] = "[X]"
                }
            }

        }
    }
}
