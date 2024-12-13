package org.example.models

data class enemigos(
    val id:Int,
    val nombre:String,
    val enegia: Int,
    val escudo:Int,
    val eliminado: Boolean = false
){


    companion object {

        fun generar():enemigos?{
            val id = 0
            val nombre = tiposEnemigos.values().random().toString()
            var energia = 0
            var escudo = 0
            if (nombre == tiposEnemigos.INFERIRUNO.toString()){
                energia = 50
            } else if (nombre == tiposEnemigos.INFERIRDOS.toString()){
                escudo = 100
            }else if (nombre == tiposEnemigos.MORTIFAGO.toString()){
                escudo = (100..150).random()
            }

            return enemigos(
                id = 0,
                nombre = nombre,
                enegia = energia,
                escudo = escudo,
                eliminado = false,

            )
        }
    }
    enum class tiposEnemigos {
        INFERIRUNO, INFERIRDOS, MORTIFAGO
    }
}

