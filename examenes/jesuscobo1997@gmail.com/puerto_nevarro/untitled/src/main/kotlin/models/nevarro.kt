package org.example.models

class nevarro(arsenal: Int, puertas: Int) {
    private val puerto = Array(arsenal){Array<naves?>(puertas){null}}
    val array = Array (5){Array<Int>(5){0}}




    fun aparcar(id: String, tipo: String, ubicacion: String) {
        val letra = separarLetra(ubicacion)
        val letraNumero = alfaNumerico(letra)
        val numero = separnumero(ubicacion)

        verificarNulos(letraNumero, numero)






    }

    /**
     * verifica que en la ubicacion sea nulo
     * @param letraNumero
     * @param numero
     *
     */
   private fun verificarNulos(letraNumero: Int, numero: Int) {
        if (puerto[letraNumero][numero] == null){
            println("se puede aparcar")
        }
    }


    /**
     * pasa la letra a numero
     * @param letra
     * @return devuelve el numero asociado con la letra
     */
    private fun alfaNumerico(letra: Char): Int {
        var numero = 0

        when(letra){
            'a' -> numero = 0
            'b' -> numero = 1
            'c' -> numero = 2
            'd' -> numero = 3
            'e' -> numero = 4
        }
        return numero

    }

    /**
     * repara la letra
     * @param ubicacion
     * @return devuelve un char que es la letra
     */
    private fun separarLetra(ubicacion: String): Char {
        val letra = ubicacion[0]
        return letra
    }

    /**
     * pide la ubicacion para reparar el numero y pasarlo a Int
     * @param ubicacion
     * @return devuel el numero en formato Int
     */
    private fun separnumero(ubicacion: String): Int {
        var numero = 0
        val char = ubicacion[2]
        when(char){
            '0' -> numero = 0
            '1' -> numero = 1
            '2' -> numero = 2
            '3' -> numero = 3
            '4' -> numero = 4
        }
        return numero
    }


}