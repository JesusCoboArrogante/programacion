package models

data class alumno(
    val id:Int,
    var nombre:String,
    val apellido:String,
    val calificacion:Double
) {
    companion object{
        fun alumnado(){
            val id = 0
            val nombre = ""
            val apellido = ""
            val nota = 0.0
        }
    }
}