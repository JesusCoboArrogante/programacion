fun main() {
    val jugadorA: Int = 60
    val jugadorB: Int = 70


    var contadorRondaA =0
    var contadorRondaB = 0


    for (i in 1 .. 3){
        var contadorA: Int = 0
        var contadorB: Int = 0
        for (j in 0 .. 5){
            if (i < 4){
                if ((0..100).random() <= jugadorA){
                    contadorA++
                    println("jugadorA gol numero $contadorA")


                }else {
                    println("jugadorB fallo")
                }

                if ((0..100).random() <= jugadorB){
                    contadorB++
                    println("jugadorB gol numero $contadorB ")


                }else {
                    println("jugadorB fallo")
                }
            }

        }
        if (contadorA > contadorB){
            contadorRondaA++
        }


    }
    println("antes del ultimo gol $contadorA")
    println("antes del ultimo gol $contadorB")

    if ((0..100).random() <= jugadorA){
        contadorA+=2
        println("jugadorA gol numero $contadorA")


    }else {
        println("jugadorB fallo")
    }

    if ((0..100).random() <= jugadorB){
        contadorB+=2
        println("jugadorB gol numero $contadorB ")


    }else {
        println("jugadorB fallo")
    }
    println("contadorA $contadorA" )
    println("contadorB $contadorB")
    if (contadorA > contadorB) {
        println("gana jugadorA con $contadorA goles")
    }else if (contadorA == contadorB){
        println("empate")
    }else {
        println("gana jugadorB con $contadorB goles ")
    }
}