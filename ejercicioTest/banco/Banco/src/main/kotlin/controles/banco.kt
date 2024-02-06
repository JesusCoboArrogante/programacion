package org.example.controles

class banco: bancoControl <Int>, user<String>{


    override fun edad(a: Int): Int {
        require(a > 12 || a < 120)
        return a
    }

    override fun telefono(a: Int): Boolean {
        val reg = Regex("^[6-7]\\d{8}\$")
        return reg.matches(a.toString())
    }

    override fun saldo(a: Int): Int {
        TODO("Not yet implemented")
    }

    override fun retirada(a: Int): Int {
        TODO("Not yet implemented")
    }

    override fun ingresar(a: Int): Int {
        TODO("Not yet implemented")
    }

    override fun username(a: String): String {
        TODO("Not yet implemented")
    }
}