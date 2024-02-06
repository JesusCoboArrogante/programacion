
fun main(args: Array<String>) {
    val loteria = IntArray(6)

    do {
       aleatorio(loteria)
       val copia = loteria.copyOf()
        var contador = comparacion(loteria)
    }while(contador > 6)
    println("este es su numero")

    copiar(loteria)
}

fun aleatorio(loteria: IntArray) {
    for (i in loteria.indices) {
        val ran = (1..49).random()
        loteria[i] = ran



    }

}
fun comparacion (loteria: IntArray): Int{

    var contador = 0
    for (i in loteria.indices){
        for (j in loteria.indices){
            if (loteria[i] == loteria[j]){
                contador++
            }
        }
    }
    return contador

}
fun copiar (copia: IntArray){
    for (i in copia.indices){
        print("-${copia[i]}-")
    }
}
