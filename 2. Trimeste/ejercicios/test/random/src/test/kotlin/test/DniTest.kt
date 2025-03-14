package test

import org.example.Dni
import org.junit.jupiter.api.*
import org.junit.jupiter.Assertions.assertEquals

@test
class DniTest {
val testDni = Dni("49154187y")

    fun cadenaOk(dni:String){
        val resultado = testDni.tamañoDni()
        Assertions.assertEquals(true, resultado)
    }

}