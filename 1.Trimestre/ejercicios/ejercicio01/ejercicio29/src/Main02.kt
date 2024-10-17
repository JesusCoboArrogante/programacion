fun main() {
    var notas: Double
    var resultado = false
    var contAprovados = 0
    var sobresaliente = 0
    var notable = 0
    var aprobado = 0
    var suspenso = 0

    do {
        notas = funComprobarNotas("introduce un numero")
        resultado=funResultado(notas)
        if (notas >=0){
            if (resultado){
                contAprovados++
                when{
                    notas >=9 ->sobresaliente++
                    notas > 6 -> notable++
                    notas > 4 -> aprobado++
                }
            }else{
                suspenso++
            }
        }
    }while (notas >=0)

    println("hay probados $contAprovados")
    println("con aprobado hay $aprobado")
    println("con notable hay $notable")
    println("con sobresaliente hay $sobresaliente")
    println("suspensos hay $suspenso")

}


fun funResultado(notas:Double):Boolean{
    var resultado = false

    if (notas >= 5){
        resultado = true
    } else if (notas > 0 && notas < 5){
        resultado = false
    }

    return resultado
}



