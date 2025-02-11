package org.example

fun main() {

    val incre = incremeta(2,3)
    println(incre)
}

fun incremeta(a: Int, b:Int):Int{
var suma = 0
    fun incrementar(): Int {
        for (i in 1..b){
             suma =  a+i
        }
        return suma

    }
    return incrementar()

}