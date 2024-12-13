package org.example.models

import kotlin.random.Random

data class ordenador(
    val id: Long = NEW_ID,
    val marca: String,
    val modelo: String,
    val tipo: Tipo,
    val procesador: String,
    val memoriaRam: Int,
    val almacenamiento: Int,
    val video: String,

    val isDeleted: Boolean = false
) {
    /**
     * Enumeración de tipos de ordenador
     * @property PORTATIL Ordenador portatil
     * @property SOBREMESA Ordenador de sobremesa
     */
    enum class Tipo {
        PORTATIL, SOBREMESA
    }

    companion object {
        val NEW_ID = 0L

        /**ç
         * Método para generar un ordenador aleatorio
         * @return Ordenador
         */
        fun random(): ordenador {
            val tipo = if (random().nextBoolean()) Tipo.PORTATIL else SOBREMESA
            return ordenador(
                marca = "Marca ${random.nextInt(100)}",
                modelo = "Modelo ${random.nextInt(100)}",
                tipo = tipo,
                procesador = "Procesador ${random.nextInt(100)}",
                memoriaRam = (1..64).random(),
                almacenamiento = (128..2048).random(),
                video = "Video ${random.nextInt(100)}"
            )
        }
    }


}
