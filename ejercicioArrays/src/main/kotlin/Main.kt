fun main(args: Array<String>) {
   var numVector = 0
    println("introduce un numero")
    numVector = readln().toIntOrNull()?:0
    val arrayVector = arrayOf(1,2,3,4,5,6,7,8,9,)
    //imprimirVector(arrayVector, numVector)
    maxVector(arrayVector, numVector)


}
fun imprimirVector (arrayVector: Array<Int>, numVector: Int){
    for (i in arrayVector.indices){
        println(i)
    }
    println("el numero es " +arrayVector[numVector -1])
}

fun maxVector (arrayVector: Array<Int>, numVector: Int){
    for (i in arrayVector.indices){
        arrayVector.shuffle()

    }


}