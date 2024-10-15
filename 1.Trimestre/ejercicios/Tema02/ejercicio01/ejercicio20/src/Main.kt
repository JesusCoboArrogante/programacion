fun main() {
    var mes: String = ""
    var ayo :Int = 0

    var bisiesto : Boolean = false

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

    if (ayo % 4 ==0 && ayo % 100 != 0 || ayo % 400 == 0){
        bisiesto = true
        print("es bisiesto y el mes $mes tiene ")
    }else(
        print("no es bisiesto y el mes $mes tiene ")
    )

    if (mes != mesDos && mes != "2"){
        if (mes == mesUno || mes == "1" ){
            println("31 dias")
        }else if (mes == mesTres || mes == "3"){
            println("31")
        }else if (mes == mesCuatro || mes == "4"){
            println("30")
        }else if (mes == mesCinco || mes == "5"){
            println("31")
        }else if (mes == mesSeis || mes == "6"){
            println("30")
        }else if (mesSiete == mes || mes == "7"){
            println("31")
        }else if (mes == mesOcho || mes == "8"){
            println("31")
        }else if (mes == mesNueve || mes == "9"){
            println("30")
        }else if (mes == mesDiez || mes == "10"){
            println("31")
        }else if (mes == mesOnce || mes == "11"){
            println("30")
        }else if (mes == mesDoce || mes == "12") {
            println("31")
        }

    }else if ((mes == mesDos ||  mes == "2") && bisiesto == true){
            println("29 dias")
        }else if ((mes == mesDos || mes == "2") && bisiesto == false){
            println("28 dias")
        }
    }
