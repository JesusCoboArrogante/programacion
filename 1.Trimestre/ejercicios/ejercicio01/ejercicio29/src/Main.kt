fun main() {
    var notas: Double
    var aprovados = 0
    var suspensos = 0
    do {

        notas = funComprobarNotas("introduce un numero")
        println(notas)
        aprovados =funAprobados(notas, aprovados)
        suspensos = funSuspensos(notas, suspensos)

    }while (notas >=0)

    println("numero de aprovados es $aprovados")
}



fun funComprobarNotas(mensaje:String): Double{
    var notas = 0.0
    var inPutSalida = false

    do {
        println(mensaje)
        notas = readln().toDouble()
        if (notas <= 10.0){
            inPutSalida = true
        }else{
            println("la nota debe ser menor a 10")
        }
    }while (!inPutSalida)
    return notas
}

fun funAprobados(notas:Double, aprovados: Int):Int{
    var aprovados = aprovados

    if (notas >= 5){
        aprovados++
    }

    return aprovados
}

fun funSuspensos(notas: Double, suspensos:Int):Int{
    var suspensos = suspensos

    if (notas > 0 && notas < 5){
        suspensos++
    }
    return suspensos
}