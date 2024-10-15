fun main() {
    var nota: Int = 0
    println("dime tu nota")
    nota = readln().toInt()
    if (nota <= 4){
        println("insuficiente")
    } else if (nota > 4 && nota < 7){
        println("suficiente")
    } else if (nota >=7  && nota < 9){
        println("notable")
    }else if (nota >=9 && nota <=10){
        println("sobresaliente")
    }
}