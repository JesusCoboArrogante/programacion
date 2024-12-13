package org.example

class horas (
    var hora:Int = 0,
    var minutos:Int = 0,
    var segundos:Int = 0
    ) {
    fun verificarhora() {
        hora
        if (hora > 24 || hora < 0){
            throw IllegalArgumentException("Las horas no pueden ser mayor a 24 0 menor a 0")
        }
    }
    fun verificarMs(tiempo: Int) {
        if (tiempo > 60 || tiempo < 0){
            throw IllegalArgumentException("Los minutos y segundos  no pueden ser mayor a 60 o menor a 0")
        }

    }
    fun ampm():String{
        var tipo:String
        if (hora < 12 || hora == 24){
             tipo = "AM"
        }else{
            tipo = "PM"
        }
        return tipo

    }
    fun cambiarhora(){
            when(hora){
                13 -> hora = 1
                14 -> hora = 2
                15 -> hora = 3
                16 -> hora = 4
                17 -> hora = 5
                18 -> hora = 6
                19 -> hora = 7
                20 -> hora = 8
                21 -> hora = 9
                22 -> hora = 10
                23 -> hora = 11
                24 -> hora = 12

            }
        }


    override fun toString(): String {
        return ("$hora:$minutos:$segundos")
    }



}