package models

class aula {

    val nAlumnos = 20
    val listaClase = Array(nAlumnos){Array <alumno?>(nAlumnos){null}}
    var contadorAlumnos= 0

    fun agregar(nombre: String, apellidos: String, notas: Double) {
       var fin = true
        for (i in listaClase.indices){
            for (j in listaClase.indices){
                var presente = buscarNulos(i,j)
                if (presente && fin){
                    contar()
                    listaClase[i][j]= alumno(id = contadorAlumnos,nombre = nombre, apellido = apellidos, calificacion = notas)
                    fin = false
                }
            }

        }
    }
    fun  imprimirListado(){
        for (i in listaClase.indices){
            for (j in listaClase.indices)
                if (listaClase[i][j] != null){
                    println(listaClase[i][j])

                }

        }
    }

    fun eliminar(id: Int) {

            for (i in listaClase.indices){
                for (j in listaClase.indices){
                    if (listaClase[i][j]?.id == id){
                        listaClase[i][j] = null
                    }
                }
            }

    }



    private fun contar() {
        contadorAlumnos++
    }


    private fun buscarNulos(i: Int, j: Int):Boolean {
       var affirmative = false
        if (listaClase[i][j] == null){
            affirmative = true
        }
        return affirmative



    }

}