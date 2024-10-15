fun main() {
    var numeroUno: Double = 0.0
    var numeroDos: Double = 0.0
    var numeroTres: Double = 0.0

    println("introduce el 1º numero")
    numeroUno = readln().toDouble()

    println("introduce el 2º numero")
    numeroDos = readln().toDouble()

    println("introduce el 3º numero")
    numeroTres = readln().toDouble()

    val media: Double = (numeroUno + numeroDos + numeroTres) / 3
    val mediaDosDecimales: Double = (media *100).toInt() /100.0

    println("$mediaDosDecimales")

   if (mediaDosDecimales == 0.0 || mediaDosDecimales < 0.50){
       println("redondeando es 0")
   }else if (mediaDosDecimales == 0.50 || mediaDosDecimales < 1.50){
       println ("redondeando es 1")
   }else if (mediaDosDecimales == 1.50 || mediaDosDecimales < 2.50){
       println("redondeando es 2")
   }else if (mediaDosDecimales == 2.50 || mediaDosDecimales < 3.50){
       println("redondeando es 3")
   }else if (mediaDosDecimales == 3.50 || mediaDosDecimales < 4.50){
        println("redondeando es 4")
   }else if (mediaDosDecimales == 4.50 || mediaDosDecimales < 5.50){
       println("redondeando es 5")
   }else if (mediaDosDecimales == 5.50 || mediaDosDecimales < 6.50){
       println("redondeando es 6")
   }else if (mediaDosDecimales == 6.50 || mediaDosDecimales < 7.50){
       println("redondeando es 7")
   }else if (mediaDosDecimales == 7.50 || mediaDosDecimales < 8.50){
       println("redondeando es 8")
   }else if (mediaDosDecimales == 8.50 || mediaDosDecimales <9.50){
       println("redondeando es 9")
   }else if (mediaDosDecimales == 9.50 || mediaDosDecimales <=10.0){
       println("redondeando es 10")
   }




}