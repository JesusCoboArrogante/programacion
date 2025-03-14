import org.example.Dni
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

class DniTest {
    private val dni = Dni("49154157y")
    @Test
    @DisplayName("validar tamaño")
    fun tamañoDni() {

        assertTrue(dni.tamañoDni(dni.dni))

    }

    @Test
    @DisplayName ("letra correcta")
    fun letra() {
        assertTrue(dni.letra(dni.dni))
    }

    @Test
    @DisplayName ("transformar String a Int")
    fun transformar() {
        val numero = 49154157
        assertEquals(dni.transformar(dni.dni), numero)
    }


}