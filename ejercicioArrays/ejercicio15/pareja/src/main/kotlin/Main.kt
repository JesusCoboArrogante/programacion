fun main(args: Array<String>) {
    val parejas = arrayOf("1","1","2","2","3","3","4","4","5","5",)
    val ver = arrayOf("X","X","X","X","X","X","X","X","X","X")
    parejas.shuffle()
    var numeroUno = 0
    var numeroDos = 0

    do {
        println()
        println("0 1 2 3 4 5 6 7 8 9")

        println("introduce un numero")
        numeroUno = readln().toIntOrNull()?:0

        println("introduce otro numero")
        numeroDos= readln().toIntOrNull()?:0

        if (numeroUno < 10 && numeroDos < 10  ){
            nose(parejas, numeroUno, numeroDos,ver)
        }



    }while (fin(parejas, ver))
8



}
fun arrayPareja(ver: Array<String>){
    for (i in ver.indices){
        print("${ver[i]} ")
    }
}


fun nose (parejas: Array<String>, numeroUno: Int, numeroDos: Int, ver: Array<String>){
    if (parejas[numeroUno] == parejas[numeroDos]){
        ver[numeroUno] = parejas[numeroUno]
        ver[numeroDos] = parejas[numeroDos]
        arrayPareja(ver)


    }else if (parejas[numeroUno] != parejas[numeroDos]){
        ver[numeroUno] = parejas[numeroUno]
        ver[numeroDos] = parejas[numeroDos]
        arrayPareja(ver)

        Thread.sleep(1000.toLong())

        for (i in 1..9){
            println()
        }
        ver[numeroUno] = "X"
        ver[numeroDos] = "X"
        println()
        arrayPareja(ver)



    }

}

fun fin(parejas: Array<String>, ver: Array<String>): Boolean {
    var continuar = true
    if (parejas.contentEquals(ver)){
        continuar = false
    }else{
        continuar = true
    }
    return continuar

}



