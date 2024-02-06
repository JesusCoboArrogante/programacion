fun main(args: Array<String>) {
    var array = arrayOf(11,12,13)
    revertir(array)

}

fun revertir(array: Array<Int>) {
    for (i in array.indices.reversed()){
        print("${array[i]} ")
    }
}
