fun main() {
    var array = arrayOf(9,1,0,2,0,1,9)
    
    println(array.joinToString("-"))
    println(array.reversed().joinToString ("-"))
    funCapicua(array)
}

fun funCapicua(array: Array<Int>) {
    var contador = 0

    for (i in array.size-1 downTo 0 ){
        if (array[i] == array[contador]){
            contador++
        }
    }

    if (contador == array.size){

        println("es capicua")
    }else {

        println("no es capicua")
    }


}
