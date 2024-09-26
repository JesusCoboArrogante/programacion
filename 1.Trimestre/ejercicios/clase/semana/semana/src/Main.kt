fun main() {
    var dia: String = ""
    var numero: Int = 0

    val diaUno: String = "lunes"
    val diaDos: String = "martes"
    val diaTres: String = "miercoles"
    val diaCueatro: String = "jueves"
    val diaCinco: String = "viernes"
    val diaSeis: String = "sabado"
    val diaSiete: String = "domingo"

    println("si quieres escribir el dia pulsa (1) y si quieres escrribir el numero pulsa (2)")
    numero = readln().toInt()

    if (numero == 1){
        println("que dia es")
        dia = readln()
        if (dia == diaUno){
            println("1")
        } else if (dia == diaDos){
            println("2")
        }else if (dia == diaTres ){
            println("3")
        }else if (dia == diaCueatro){
            println("4")
        }else if ( dia == diaCinco){
            println("5")
        }else if (dia == diaSeis){
            println("6")
        }else if ( dia ==  diaSiete){
            println("7")
        }else{
            println("error")
        }

    } else if (numero == 2){
        println("que numero de dia quieres")
        numero = readln().toInt()
        when{
            numero == 1 -> println(diaUno)
            numero == 2-> println(diaDos)
            numero == 3 -> println(diaTres)
            numero == 4 -> println(diaCueatro)
            numero == 5 -> println(diaCinco)
            numero == 6 -> println(diaSeis)
            numero ==  7 -> println(diaSiete)
            numero > 7 -> println("error")
        }

    } else{
        println("Error")
    }

}