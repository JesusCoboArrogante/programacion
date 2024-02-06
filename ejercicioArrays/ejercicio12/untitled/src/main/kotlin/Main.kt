fun main(args: Array<String>) {
    var numero = 0
    println("introduce un numero")
     numero = readln().toIntOrNull()?:0
    val array = IntArray(numero)
    sumar(array, numero)
    println()
    multiplicar(array, numero)






}

fun sumar (array: IntArray, numero:Int){
    var fuera = 0
    fuera = numero
    for (i in array.indices){
        array[i] = fuera
        fuera+=1

        print("-${array[i]}-")


    }
}

fun multiplicar (array: IntArray, numero:Int){
    var nueva = 0
    nueva = numero
    for (i in array.indices){


        array[i] = nueva
        print("-${array[i]}-")
        nueva += nueva




    }
}