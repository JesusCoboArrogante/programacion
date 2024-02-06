package org.example.controles



class DniControl: Dni<Boolean> {
    override fun numero(a: String): Boolean {
        val regex = Regex("^[0-9]{8}\$")
        if (regex.matches(a))
            return true
        return false

    }

    override fun letra(a: String): String {
        TODO("Not yet implemented")
    }

   
}