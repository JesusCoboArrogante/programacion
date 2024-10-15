import java.security.KeyStore.TrustedCertificateEntry

fun main() {
    primoGemolos(3)
}

fun FunPrimos(primoDos: Int):Boolean{
   var inputSalida = true
   var primo:Int = 0
   var verdadPrimo: Boolean = false
   do {

         var contador:Int = 0
         for (j in 1.. primo){

            if (primo % j ==0 ) {
               contador++

            }
         }
         if (contador ==  2){
            inputSalida

         }





      inputSalida = true
   }while (!inputSalida)
   return verdadPrimo

}

fun primoGemolos(primo:Int){
   val primoUno: Int = 3
   var primoDos: Int = 0


   val contador = 0

   if (FunPrimos(primoUno + 2)){
      primoDos = primoUno + 2
      println("es $primoUno y $primoDos")
   }



}