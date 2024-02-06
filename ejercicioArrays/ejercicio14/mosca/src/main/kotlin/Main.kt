import kotlin.coroutines.Continuation

fun main(args: Array<String>) {

    val mosca = arrayOf("[ ]","[ ]","[ ]","[ ]","[M]",)
    mosca.shuffle()

        do {

            val posicion: Int
            println("[0][1][2][3][4]")
            println("------------")
            println("donde esta la mosca")
            posicion = readln().toIntOrNull()?:0

        }while (juego(mosca, posicion))

}


fun arrai (mosca: Array<String>, mostar: Boolean): Int {
    var indice = 0

    for (i in mosca.indices){

        if (mostar){
            print(mosca[i])
        }

        if (mosca[i] == "[M]"){
            indice = i
        }
    }
    println()
    return indice
}


fun juego (mosca: Array<String>, posicion: Int): Boolean{

    var retorno = true
    var indiceMosca = arrai(mosca, false)


            if (indiceMosca == posicion){
                arrai(mosca, true)
                print("mosca muerta")

                retorno = false

            }else if (posicion +1 == indiceMosca || posicion - 1 == indiceMosca){
                arrai(mosca, true)
                mosca.shuffle()

                println("casi pero no")


            } else {
                println("no has acertado")



            }

    return retorno





    println()

}




