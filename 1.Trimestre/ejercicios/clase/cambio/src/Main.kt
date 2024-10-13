fun main() {

    var cantidad = 0.0
    val dosEuros = 200
    val unEuro = 100
    val cincuentaCts = 50
    val veinteCts = 20
    val diezCts = 10
    val cincoCts = 5
    val dosCts = 2
    val unoCts = 1
    println("ingrese el dinero")
    cantidad = readln().toDouble()
    cantidad*=100
    println(cantidad)
    funRepartir(cantidad,unEuro,dosEuros,cincuentaCts,veinteCts,diezCts,cincoCts, dosCts,unoCts)

}
fun funRepartir(cantidad: Double,uno:Int, dos:Int, cincuenta:Int, veinte:Int, diez:Int,cinco:Int, dosCts:Int, unoCts:Int ){
    var cantidad = cantidad
    var contDos = 0
    var contUno = 0
    var contCincuenta = 0
    var contVeinte = 0
    var contDiez = 0
    var contCinco = 0
    var contDosCts = 0
    var contUnoCts = 0

        do {
            if (cantidad >= dos){

            }
            when {
                cantidad >= dos -> {
                    contDos++
                    cantidad-=dos
                }
                cantidad >=uno -> {
                    contUno++
                    cantidad-=uno
                }
                cantidad >=cincuenta -> {
                    contCincuenta++
                    cantidad-=cincuenta
                }
                cantidad >=veinte -> {
                    contVeinte++
                    cantidad-=veinte
                }
                cantidad >=diez -> {
                    contDiez++
                    cantidad-=diez
                }
                cantidad >=cinco -> {
                    contCinco++
                    cantidad-=cinco
                }
                cantidad >= dosCts -> {
                    contDosCts++
                    cantidad-=dosCts
                }
                cantidad >= unoCts -> {
                    contUnoCts++
                    cantidad-= unoCts
                }

            }
        }while (cantidad != 0.0)

        println("De $dos hay $contDos")
        println("De $uno hay $contUno")
        println("De $cincuenta hay $contCincuenta")
        println("De $veinte hay $contVeinte")
        println("De $diez hay $contDiez")
        println("De $cinco hay $contCinco")
        println("De $dosCts hay $contDosCts")
        println("De $unoCts hay $contUnoCts")



}