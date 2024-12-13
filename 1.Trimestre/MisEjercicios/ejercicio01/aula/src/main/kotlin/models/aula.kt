package models

class aula {
    val nAlumnos = 20
    val listaClase = Array(nAlumnos){Array <alumno?>(nAlumnos){null}}

    fun agregar(){
        for (i in listaClase.indices){
            for (j in listaClase.indices){
                if (buscarNulos(i,j))
            }

        }
    }



   private fun buscarNulos(i: Int, j: Int):boolean{
       if (listaClase[i][j] == null){

       }


    }

}