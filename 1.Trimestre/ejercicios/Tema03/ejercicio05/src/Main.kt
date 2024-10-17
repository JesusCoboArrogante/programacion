fun main() {
    val array = arrayOf(3,5,7,1,2,4,6,9)

    println("${array.joinToString()}")
    funReverse(array)


}


fun funReverse(array: Array<Int>){

    val arrayUno = IntArray (array.size)

    for (i in  array.size-1 downTo 0){

        print("${array[i]}, ")


    }



}




