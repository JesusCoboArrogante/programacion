package org.example.moduls

import kotlin.random.Random



data class alumnos (
    var id:Int = new_id,
    var nombre: String,
    var apellido: String,
    var calificacion:Double,
    var eliminarAlumno:Boolean = false
) {


    /**
     * una lista de nombre masculino y femeninos
     */
    enum class nombres() {
        Daria, Lucas , Noe, Leo, Ian, Lia, Vega, Amaya, Marina, Aitana;
    }
     enum class apellidos {
        Cordero, Blanco, Gomez, Lopez, Serrano, Romero, Moreno, Torres, Vega, Gonzalez;
    }
    companion object{
        private var new_id = 0
        fun generar (): alumnos {

            return alumnos(
                nombre = nombres.values().random().toString(),
                apellido = apellidos.values().random().toString(),
                calificacion = Random.nextDouble(0.0, 10.0),

            )
        }
    }


}