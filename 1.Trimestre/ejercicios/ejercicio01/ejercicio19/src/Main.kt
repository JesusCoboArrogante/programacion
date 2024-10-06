fun main() {
    var turno: String = ""
    var dia: String = ""
    var salario: Int = 0

    var inPutSalida: Boolean = false

    val horaDiurno: Int = 20
    val horaNocturna: Int = 35
    val domingoDiurna: Int = 15
    val domingoNocturno: Int = 10
    val horas:Int = 8

    do {
        println("que dia es")
        dia = readln().lowercase()

        if (dia == "lunes" || dia =="martes" || dia == "miercoles" || dia == "jueves" || dia == "viernes" || dia == "sabado" || dia == "domingo"){
            inPutSalida = true
        }else{
            println("no es un dia de la semana")
        }
    }while (!inPutSalida)

    inPutSalida = false

    do {
        println("que turno tienes")
        turno = readln().lowercase()

        if (turno == "diurno" || turno == "nocturno"){
            inPutSalida = true
        }else{
            println("no es un turno")
        }
    }while (!inPutSalida)

    if (turno == "diurno" && dia !="domingo"){
        salario = horaDiurno * horas
        println("1.tu salario es $salario€")
    }else if (turno == "nocturno" && dia !="domingo"){
        salario = horaNocturna * horas
        println("2.tu salario es $salario€")
    }else if (turno == "diurno" && dia =="domingo") {
        salario = (horaDiurno + domingoDiurna) * horas
        println("3.tu salario es $salario€")
    }else if (turno == "nocturno" && dia == "domingo") {
        salario = (horaNocturna + domingoNocturno) * horas
        println("4.tu salario es $salario€")
    }

}