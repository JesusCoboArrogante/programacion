fun main() {
    var via: String = ""
    var velocidad: Int = 0

    println("¿en que via estaba?")
    via = readln().toString()

    println("¿a que velocidad iba?")
    velocidad = readln().toInt()

        when {
            (via == "ciudad" && velocidad > 55) -> {
                println("multa")}

            (via == "carretera" && velocidad > 99) ->{
                println("multa")}

            (via =="autopista" && velocidad > 132) ->{
                println("multa")
            }
            (via == "ciudad" || via == "carretera" || via == "autovia") ->{
                println("te has librado")
            }
        }


}