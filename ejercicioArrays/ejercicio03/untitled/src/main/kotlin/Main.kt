fun main(args: Array<String>) {
    var arrayUno = arrayOf(11,12,13)
    var arrayDos =  arrayOf(21,22,23)

    array (arrayUno, arrayDos)
    println("sumar")
    suma (arrayUno, arrayDos)
    println("resta")
    resta (arrayUno, arrayDos)
    escalar (arrayUno, arrayDos)
}

fun array(arrayUno: Array<Int>, arrayDos: Array<Int>) {
    for (i in arrayDos.indices){
        print("${arrayDos[i]} ")
    }
    println()

    for (i in arrayUno.indices){
        print("${arrayUno[i]} ")
    }

    println()

}
fun escalar(arrayDos: Array<Int>, arrayUno: Array<Int>) {
    var escalado = 0
    var resultado = 0
    for (i in arrayUno.indices){
            resultado = arrayUno[i] *  arrayDos[i]
            escalado += resultado





    }
    println("el escalado es $escalado")

}



fun suma(arrayDos: Array<Int>, arrayUno: Array<Int>) {

    var resultado = 0
    for (i in arrayUno.indices){

            resultado = arrayUno[i] +  arrayDos[i]
            print("$resultado ")



    }
    println()
}

fun resta (arrayDos: Array<Int>, arrayUno: Array<Int>) {

    var resultado = 0
    for (i in arrayUno.indices){
        if (arrayUno[i]> arrayDos[i]){
            resultado = arrayUno[i] -  arrayDos[i]
            print("$resultado ")
        }else{
            resultado = arrayDos[i] - arrayUno[i]
            print("$resultado")
        }




    }
    println()

}