fun main() {
    var horas: Int = 0
    var minutos: Int = 0
    var segundos: Int = 0
    var inputSalida = false

    do {
        println("introduce las horas ")
        horas = readln().toIntOrNull()?:25
        if (horas <= 23){
            inputSalida = true
        }else{
            println("que ser menor a 25 ")
        }

    }while (!inputSalida)

    inputSalida = false

    do {
        println("introduce los minutos ")
        minutos = readln().toIntOrNull()?:60
        if (minutos < 60 ){
            inputSalida = true
        }else{
            println("que ser menor a 60 ")
        }

    }while (!inputSalida)

    inputSalida = false

    do {
        println("introduce los segundos ")
        segundos = readln().toIntOrNull()?:60
        if (segundos < 60){
            inputSalida = true
        }else{
            println("que ser menor a 60 ")
        }

    }while (!inputSalida)

    inputSalida = false

    if (segundos +1 < 60){
        segundos++
        println("$horas:$minutos:$segundos")
    }else{
        segundos = 0
        if (minutos +1 < 60 ){
            minutos++
            println("$horas:$minutos:$segundos")
        }else{
            minutos = 0
            if (horas+ 1 < 24){
                horas++
                println("$horas:$minutos:$segundos")
            }else{
                horas = 0
                println("$horas:$minutos:$segundos")

            }

        }


    }
}