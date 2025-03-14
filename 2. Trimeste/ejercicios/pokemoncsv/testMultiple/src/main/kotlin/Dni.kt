package org.example

class Dni (val dni:String) {

    fun tamañoDni(s: String): Boolean {
        val regex = "^[1-9]{8}[^iouñ]".toRegex()
        println(regex)
        return regex.matches(dni)
    }

    fun letra(dni: String): Boolean {
        var letraDni = false
        val numero = listOf(0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22)
        val letra = listOf('t','r','w','a','g','m','y','f','p','d','x','b','n','j','z','s','q','v','h','l','c','k','e')
        val n = transformar(dni)
        val resto = n % 23
        for (i in numero.indices){
            if (i == resto){
                if (letra[i] == dni[8]){
                    letraDni = true
                }
            }
        }
        return letraDni

    }

     private fun transformar(dni: String):Int{
        var numero = ""
         for (i in dni.indices-8){
             numero+=dni[i]
         }
         return numero.toInt()
    }




}