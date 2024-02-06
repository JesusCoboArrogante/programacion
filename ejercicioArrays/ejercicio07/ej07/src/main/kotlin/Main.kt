fun main(args: Array<String>) {
    var num = 0
    println("introduce un numero")
    num = readln().toIntOrNull()?:0
    var array = num.toString().toCharArray()

    val segundo = arrais(num.toString().toCharArray())
    capicua(array, segundo)


}



fun arrais(array: CharArray): CharArray {
    var segundo = CharArray(array.size)
    var j = 0
    for (i in array.indices.reversed()) {
        segundo[j] = array[i]
        j ++

    }
    return segundo






}
fun capicua (array: CharArray, segundo: CharArray){
    if (array.contentEquals(segundo)) {
        println("capicua")
    }else {
        println("no es capicua")
    }
}