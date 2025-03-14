package org.example.models

data class Pokemon (
    val id:Int,
    val nombre:String,
    val tipo1:String,
    val tipo2:String,
    val total:Int,
    val hp:Int,
    val attack:Int,
    val defensa:Int,
    val spAtk:Int,
    val spDef:Int,
    val speed:Int,
    val generation:Int,
    val legendario:Boolean
)