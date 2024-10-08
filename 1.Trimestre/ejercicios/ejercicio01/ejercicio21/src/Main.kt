fun main() {
    println("Hello World!")
    sumapares()
}
fun sumapares(){

    for (i in 1 .. 20){
        if (i % 2 == 0){
            println("el numero $i es par")
        }
    }
}