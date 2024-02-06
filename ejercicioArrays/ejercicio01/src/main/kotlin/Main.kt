fun main(args: Array<String>) {
   var numVector = 0
    println("introduce un numero")
    numVector = readln().toIntOrNull()?:0
    val arrayVector = arrayOf(11,12,13,14,15,16,17,18,19,)
    imprimirVector(arrayVector,numVector)

    maxVector(arrayVector)
    burbuja(arrayVector)



}
fun imprimirVector (arrayVector: Array<Int>, numVector: Int){
    for (i in arrayVector.indices){
        //println(i)
    }
    println("el numero es " +arrayVector[numVector -1])
}

fun maxVector (arrayVector: Array<Int>){
    var max = 0
    var menor = 19
    var indice = 1
    var media = 0
    arrayVector.shuffle()
    for (indice in arrayVector.indices){
        print(arrayVector[indice])
       println("=$indice")
        media += arrayVector[indice]
        if (arrayVector[indice]>max){
            max = arrayVector[indice]


        }else if (arrayVector[indice]< menor) {
            menor = arrayVector[indice]
        }


    }
    println("el mayor es $max en el indice es ${arrayVector.indexOf(max)}")
    println("el menor es $menor en el indice es ${arrayVector.indexOf(menor)}")
    println("la media es " + media/2)

}

fun burbuja (arrayVector: Array<Int>){
    var contador = 0
    arrayVector.shuffle()

    for (i in 0 until arrayVector.size){
        for (j in 0 until arrayVector.size -1){
            if (arrayVector[j] > arrayVector[j +1 ]){
                contador = arrayVector[j]
                arrayVector[j] = arrayVector[j + 1]
                arrayVector[j + 1] = contador
                print("$contador | ")
            }
        }
    }
}