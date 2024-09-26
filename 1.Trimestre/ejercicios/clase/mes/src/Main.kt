fun main() {
    var mes: String = ""
    var ayo :Int = 0


    val mesUno: String = "enero"
    val mesDos: String = "febrero"
    val mesTres: String = "marzo"
    val mesCuatro: String = "abril"
    val mesCinco: String = "mayo"
    val mesSeis: String = "junio"
    val mesSiete: String = "julio"
    val mesOcho: String = "agosto"
    val mesNueve: String = "septiembre"
    val mesDiez: String = "octubre"
    val mesOnce: String = "noviembre"
    val mesDoce: String = "diciembre"

    println("que mes quieres")
    mes = readln().lowercase()

    println("dime el año")
    ayo = readln().toInt()


    if (mes != mesDos){
        if (mes == mesUno){
            println("31")
        }else if (mes == mesTres){
            println("31")
        }else if (mes == mesCuatro){
            println("30")
        }else if (mes == mesCinco){
            println("31")
        }else if (mes == mesSeis){
            println("30")
        }else if (mesSiete == mes){
            println("31")
        }else if (mes == mesOcho){
            println("31")
        }else if (mes == mesNueve){
            println("30")
        }else if (mes == mesDiez){
            println("31")
        }else if (mes == mesOnce){
            println("30")
        }else if (mes == mesDoce) {
            println("31")
        }else{
            println("error")
        }

    }else if (mes == mesDos){
        if (ayo % 4 ==0 && ayo % 100 != 0 || ayo % 400 == 0){
            println("29")
        }else {
            println("28")
        }
    }
}