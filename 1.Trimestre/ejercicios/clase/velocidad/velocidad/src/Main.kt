fun main() {
    var velocidad: Int = 0
    println("¿a que velocidad ibas?")
    velocidad = readln().toInt()
    if (velocidad <= 120){
        println("no esta multado")
    }else {
        println("estas multado")
    }
}