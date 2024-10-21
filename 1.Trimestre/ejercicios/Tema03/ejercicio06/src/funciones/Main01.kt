package funciones

fun funTamaño(cadenaUno: String, cadenaDos: String) {
    if (cadenaUno.split(" ").size < cadenaDos.split(" ").size){

        funcomparacion(cadenaUno,cadenaDos)
    }else{

        funcomparacion(cadenaDos,cadenaUno)
    }



}


fun funcomparacion(cadenaUno: String, cadenaDos: String) {
    val cadenaUno = cadenaUno.split(" ")
    val cadenaDos = cadenaDos.split(" ")
    var salida = false
    var palabra = " "





    for (i in cadenaUno.indices){
        var contador = 0
        for (j in cadenaDos.indices){

            if (cadenaUno[i] == cadenaDos[j]){
                palabra = cadenaUno[i]
                contador++
                salida = true



            }


        }
        if (salida){
            println("la palabra $palabra se repite $contador")
        }
        salida = false

    }



}