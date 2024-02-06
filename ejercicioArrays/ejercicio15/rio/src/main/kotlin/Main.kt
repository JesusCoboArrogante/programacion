fun main(args: Array<String>) {
    val rana = IntArray(10)
    var piedra = 0
   var intensidad = 0


    println("lanza la piedra")
    piedra = readln().toIntOrNull()?:0

   // println("como es la intensidad de la piedra")
    //intensidad = readln().toIntOrNull()?:0
    salto(rana, piedra, intensidad)



}

fun salto(rana: IntArray, piedra: Int, intensidad: Int) {
    var suma = piedra
    var resta = piedra
    for (i in rana.indices){

        if (suma < rana.size) {
            rana[suma] = suma
            suma++
        }

        if (resta >= 0) {
            rana[resta] = i
            resta--
        }
       // onda(rana, piedra, intensidad)


        print("-[${rana[i]}]-")


    }
}

fun onda (rana: IntArray, piedra: Int, intensidad: Int){
    var derecha = intensidad + piedra +1
    var izquierda = piedra - intensidad
    for (i in rana.indices){
        if(izquierda >=0 && rana[i] < rana[izquierda] ){
            rana[i] = 0



        }

        if ( derecha < rana.size && rana[i] == rana[derecha] ){
            rana[i] = 0
            derecha++


        }


    }


}



