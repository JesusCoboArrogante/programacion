
fun main() {

    var jugadorUno: Int = funVerificarDinero("¿cuanto dinero tienes?") //se almacena el dinero que nosotro tengamos
    var ganar: Boolean = true
    var acciones: String = "" // se almacena dos distintas acciones que hay en el codigo
    var cartaJugadorUno = 0
    var cartaJugadorDos = 0
    var apuestas: Int = 0

    do {

        apuestas = funApuesta("¿cuanto quieres apostar?", jugadorUno)


        var cartasTotalesDos: Int = 0
        var cartasTotalesUno:Int = 0

        //he hecho un bucle de dos porque se reparte 2 veces y solo podemos ver una de las cartas del crupier
        for (i in 1..2){
            cartaJugadorUno = funRepartirJugadorUno((1..11).random())
            cartasTotalesUno += cartaJugadorUno


            cartaJugadorDos = funRepartirJugadorDos((1..11).random())
            cartasTotalesDos+= cartaJugadorDos

            if (i == 1){
                println("jugador Dos tiene $cartaJugadorDos")
            }
        }
        println("jugador Uno suma $cartasTotalesUno")

        //esta es la primera accion del codigo
        // que consiste si te plantas sigue el juego normal y si doblas, doblas lo que has apostado antes y recibes una carta más
        acciones = funAcciones("pulsa 1. si te plantas \nPulsa 2. si doblas")
        if (acciones == "2"){
            //como solo quita el dinero cuando perdemos, he puesto este if para saber si el saldo sigue siendo positivo
            if ((jugadorUno - (apuestas * 2)) <= 0){
                println("no puedes doblar saldo insuficiente")
            }else{
                apuestas *=2
                cartaJugadorUno = funRepartirJugadorUno((1..11).random())
                cartasTotalesUno += cartaJugadorUno
            }




        }

        //en la funcion ganar compara el número total de mis cartas con la del crupier
        // si gano suma recibo un tercio de lo apostado y si pierdo me lo quita de jugadorUno
        ganar = funGanar(cartasTotalesUno,cartasTotalesDos)
        if (ganar){
            jugadorUno = funRecibirDinero(jugadorUno, apuestas)
            println("enhorabuena tu saldo es $jugadorUno")
        }else{
             jugadorUno -= apuestas
            println("has perdido tu saldo es $jugadorUno")
        }

        // pregunta si deseo continuar siempre y tenga dinero
        if (jugadorUno > 0){
            acciones = funAcciones("Pulsa 1. si quieres continuar continuar \nPulsa 2. si quieres abandonar abandonar").toString()
        }


    }while (acciones == "1" && jugadorUno != 0)



}


fun funVerificarDinero(mensaje: String):Int{
    var dinero: Int = 0
    var inPutSalido: Boolean = false
    do {
        println(mensaje)
        dinero = readln().toIntOrNull()?:0
        if (dinero > 0){
            inPutSalido = true
        }else{
            println("cantidad incorrecta")
        }
    }while (!inPutSalido)

    return dinero


}
// aqui verifica que tenga dinero en la cuenta
fun funApuesta(mensaje: String, dinero:Int):Int{
    var apuesta: Int
    var inPutSalido: Boolean = false
    do {
        println(mensaje)
        apuesta = readln().toIntOrNull()?:0
        if (apuesta in 1..dinero){

            inPutSalido = true

        }else{
            println("cantidad incorrecta")
        }
    }while (!inPutSalido)

    return apuesta
}

fun funRepartirJugadorUno(carta: Int, ):Int{

    var repartir = carta
    var inPutSalida = false


    if (repartir == 1){

        do {
            println("quieres un 1 o un 11")
            repartir = readln().toIntOrNull()?:-1
            if (repartir == 1 || repartir == 11){
                inPutSalida = true
            }else {
                println("numero incorrecto")
            }
        }while (!inPutSalida)

    }

    println("jugador Uno tiene $repartir ")


    return  repartir
}

fun funRepartirJugadorDos(carta:Int):Int{
    var repartir: Int = carta
    var inPutSalida: Boolean = false



    if (carta == 1){

        if (repartir < 10){
            repartir = 11


        }else if (repartir > 10){
            repartir = 1

        }

    }

    return  repartir

}




fun funAcciones (mensaje: String): String{
    var respuesta: String
    var inPutSalida = false
    do {
        println(mensaje)
        respuesta = readln()
        when(respuesta){
            "1" -> inPutSalida = true
            "2" -> inPutSalida = true
            else -> println("error")
        }

    }while (!inPutSalida)
    return respuesta
}
//solo he puesto los casos en los que gano
fun funGanar (jugadorUno: Int, jugadorDos:Int): Boolean{
    var ganar = false

    if (jugadorUno > jugadorDos && jugadorUno <= 21){
        println("ganador jugadorUno: jugadorUno tiene $jugadorUno y el jugadorDos tiene $jugadorDos")
        ganar = true
    }else if (jugadorDos > 21 && jugadorUno < 21){
        println("ganador jugadorUno: jugadorUno tiene $jugadorUno y el jugadorDos tiene $jugadorDos")
        ganar = true
    }else {
        println("ganador jugadorDos: jugadorDos tiene $jugadorDos y el jugadorDos tiene $jugadorUno")
    }

    return ganar
}

fun funRecibirDinero(jugadorUno: Int, apuesta: Int): Int{
    var recibir = apuesta /3
    recibir += jugadorUno
    return recibir
}




