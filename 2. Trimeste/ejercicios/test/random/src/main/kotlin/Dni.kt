package org.example

class Dni (val dni:String) {
    fun tamañoDni(): Boolean {
        val regex = "^[1-9]{8}[^iouñ]".toRegex()
        return regex.matches(dni)
    }






}