fun main() {
    val jugadorA: Int = 60
    val jugadorB: Int = 70


    var contadorRondaA =0
    var contadorRondaB = 0


    for (i in 1 .. 3){
        var contadorA: Int = 0
        var contadorB: Int = 0
        for (j in 0 .. 5){
            if (j <= 4){
                if ((0..100).random() <= jugadorA){
                    contadorA++
                }

                if ((0..100).random() <= jugadorB){
                    contadorB++
                }


            }
            if (j == 5){

                if ((0..100).random() <= jugadorA){
                    contadorA+=2

                }

                if ((0..100).random() <= jugadorB){
                    contadorB+=2

                }
            }

        }
        if (contadorA > contadorB){
            contadorRondaA+=1
            println ("la  ronda $i la gana jugadorA con $contadorA goles y el perdedor jugadorB con $contadorB goles")
        }else {
            contadorRondaB+=1
            println ("la  ronda $i la gana jugadorB con $contadorB goles y el perdedor jugadorA con $contadorA goles")
        }


    }

    if (contadorRondaA > contadorRondaB){
        println("el ganador es jugadorA con $contadorRondaA frente a jugadorB $contadorRondaB ")
    }else if(contadorRondaA< contadorRondaB){
        println("el ganador es jugadorB con $contadorRondaB frente a jugadorA $contadorRondaA ")
    }else{
        println("empate el jugadorA tiene $contadorRondaA y jugadorB tiene $contadorRondaB")
    }


}