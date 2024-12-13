package org.example.moduls

import org.lighthousegames.logging.logging

class aula() {
    val log = logging()
    private val max_alumnos = 21
    private var lista = Array<alumnos?>(max_alumnos){null}
    private var n_Alumnos = 0
    var newId = 1

    private fun sitioVacio(): Int {
        for (index in lista.indices ){
            if (lista[index] == null){
                return index
            }
        }
        throw IllegalStateException("No se ha  posición vacía ")
    }

    fun crear(alumnos: alumnos):alumnos{
        validarAlumno(alumnos)
        val newAlumno = alumnos.copy(id = newId++)
        val posicion = sitioVacio()
        lista[posicion] = newAlumno
        n_Alumnos++
        return alumnos
    }

    private fun validarAlumno(alumnos: alumnos) {
        require(alumnos.calificacion >= 0 || alumnos.calificacion <=10){"debe ser entre 0 y 10"}
        require(alumnos.nombre.isNotBlank()){"el campo no debe estar vacio"}
        require(alumnos.apellido.isNotBlank()){"el campo no debe estar vacio"}
    }

     fun imprimir(ordenar: Array<alumnos>) {

        for (i in ordenar.indices){
                println(ordenar[i])
        }
    }

     private fun sinNulos(): Array<alumnos> {
        val listaSinNulos = Array<alumnos?>(n_Alumnos){null}
        var indice = 0
        for (alumno in lista){
            if (alumno != null){
                listaSinNulos[indice] = alumno
                indice++
            }

        }
        return listaSinNulos as Array<alumnos>
    }

     fun notaDes(): Array<alumnos> {
         val alumno = sinNulos()
        for (i in 0 until alumno.size-1){
            for (j in 0 until alumno.size -i -1){
                if (alumno[j].calificacion < alumno[j+1].calificacion ){
                    println("cambio")
                    val cambio = alumno[j]
                    alumno[j] = alumno[j+1]
                    alumno[j+1] = cambio
               }
            }
        }
         return alumno
    }
     fun notaAsc(): Array<alumnos> {

         val alumno = sinNulos()
        for (i in 0 until alumno.size-1){
            for (j in 0 until alumno.size -i -1){
                if (alumno[j].calificacion > alumno[j+1].calificacion ){
                    val cambio = alumno[j]
                    alumno[j] = alumno[j+1]
                    alumno[j+1] = cambio
                }
            }
        }

        return alumno
    }

     fun apellDes(): Array<alumnos> {
         val alumno = sinNulos()
        for (i in 0 until alumno.size-1){
            for (j in 0 until alumno.size -i -1){
                if (alumno[j].apellido.substring(0) > alumno[j+1].apellido.substring(0) ){
                    val cambio = alumno[j]
                    alumno[j] = alumno[j+1]
                    alumno[j+1] = cambio
                }
            }
        }

         return alumno
    }
     fun apellAsc(): Array<alumnos> {
         val alumno = sinNulos()
        for (i in 0 until alumno.size - 1) {
            for (j in 0 until alumno.size - i - 1) {
                if (alumno[j].apellido.substring(0) < alumno[j + 1].apellido.substring(0)) {
                    val cambio = alumno[j]
                    alumno[j] = alumno[j + 1]
                    alumno[j + 1] = cambio
                }
            }
        }

         return alumno
    }
    fun actualizar(id: Int, alumno: alumnos):alumnos{
        println(alumno)
        val indice = buscarId(id)
        validarAlumno(alumno)
        val actualizarLista = alumno.copy(id = id)
        lista[indice] = actualizarLista
        return  actualizarLista
    }



    private fun buscarId(id: Int): Int {
        for (i in lista.indices){
            if (lista[i]?.id == id){
                return i
            }
        }
        throw Exception ("no se encontro el id $id")
    }
    fun borrar(id: Int):alumnos{
        val indice = buscarId(id)
        val eliminarAlumno = lista[indice]!!
        lista[indice] = null
        n_Alumnos--
        return eliminarAlumno.copy()
    }

    fun resultado() {
        var aprobado = 0
        var suspesos = 0
        var media = 0.0
        for (alumno in lista){
            if (alumno != null) {
                if (alumno.calificacion < 5){
                    suspesos++
                   media+= alumno.calificacion
                }else{
                    aprobado++
                    media+= alumno.calificacion
                }
            }
        }
        media/= n_Alumnos
        println("hay $aprobado, hay $suspesos y la media es $media")
    }



}








