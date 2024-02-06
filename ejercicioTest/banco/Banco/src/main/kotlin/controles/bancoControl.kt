package org.example.controles

interface bancoControl <T>{
    fun edad(a:T):T
    fun telefono (a:T): Boolean
    fun saldo (a:T): T
    fun retirada (a:T): T
    fun ingresar (a:T): T
}

interface user <T>{
    fun username (a:T): T
}