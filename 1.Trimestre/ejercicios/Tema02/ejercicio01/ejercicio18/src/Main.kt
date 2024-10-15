fun main() {
    var km: Int = 0
    var estancia: Int = 0
    var precio: Double = 0.0

    var inputSalida: Boolean = false

    val kmDescuanto: Int = 800
    val estanciaDescuento: Int = 7
    val tarifa: Double = 2.50
    val descuento: Double = 0.30



    do {
        println("cuantos km vas a recorrer")
        km = readln().toIntOrNull()?:-1
        if (km > 0){
            inputSalida = true
        }else{
            println("los km debe ser mayor a 0")
        }
    }while (!inputSalida)

    inputSalida = false

    do {
        println("cuantos dias vas a permanecer")
        estancia = readln().toIntOrNull()?:-1
        if (estancia >= 0){
            inputSalida = true
        }else{
            println("el numero de dias debe ser mayor o igual a 0")
        }
    }while (!inputSalida)

    if (km > kmDescuanto && estancia > estanciaDescuento){
        precio = (km * tarifa) - ((km * tarifa) * descuento)
        println("1. por estar $estancia y recorrer $km el precio es $precio€")
    }else{
        precio = km * tarifa
        println("2. por estar $estancia y recorrer $km el precio es $precio€")
    }


}