package org.example.crud

import org.example.models.Vehiculo
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import kotlin.jvm.Throws

class VehiculoRepositoryImpl():VehiculoRepository {
    private  val jdbcUrl = "jdbc:h2:./vehiculos"
    private val jdbcUserName = "sa"
    private val jdbcPassword = ""

    init {
        createTable()
    }

    private fun getConnection(): Connection {
        return DriverManager.getConnection(jdbcUrl, jdbcUserName,jdbcPassword)
    }

    private fun createTable(){
        val sql = """
            CREATE TABLE IF NOT EXISTS vehiculos(
            id IDENTITY PRIVATE KEY,
            marca VARCHAR(100)NOT NULL,
            modelo VARCHAR(100)NOT NULL,
            fecha DATE NOT NULL
            permisoActivo BOOLEAN NOT NULL
            tipo VARCHAR(100)NOT NULL
            )
        """.trimIndent()

        try {
            getConnection().use { connection ->
                connection.createStatement().use { statement ->
                    statement.execute(sql) }
            }
        } catch (e: SQLException){
            throw RuntimeException("error")
        }
    }

    override fun findAllby(): List<Vehiculo> {
        val vehiculo = mutableListOf<Vehiculo>()
        val sql = "SELECT * FROM vehiculo"
        try {
            getConnection().use { connection ->
                connection.createStatement().use { statement ->
                    statement.executeQuery(sql).use { resultSet ->
                        while (resultSet.next()){
                            vehiculo.add(
                                Vehiculo(
                                    resultSet.getInt("id"),
                                    resultSet.getString("matricula"),
                                    resultSet.getString("marca"),
                                    resultSet.getString("modelo"),
                                    resultSet.getString("fechaMatricula"),
                                    resultSet.getBoolean("permisoActivo"),
                                    resultSet.getString("tipo")

                                )
                            )
                        }
                    }
                }
            }
        } catch (e:SQLException){
            throw  RuntimeException("Error al obtener todos los vehiculos",e)
        }
        return vehiculo
    }

    override fun FindByID(id: Int): Vehiculo? {
        val sql = "SELECT * FROM vehiculos WHERE id = ?"
        try {
            getConnection().use { connection ->
                connection.prepareStatement(sql).use { statement ->
                    statement.setInt(1, id)
                    statement.executeQuery().use { resultSet ->
                        if (resultSet.next()){
                            return Vehiculo(
                                resultSet.getInt("id"),
                                resultSet.getString("matricula"),
                                resultSet.getString("marca"),
                                resultSet.getString("modelo"),
                                resultSet.getString("fechaMatricula"),
                                resultSet.getBoolean("permisoActivo"),
                                resultSet.getString("tipo"))
                        }
                    }
                }
            }
        }catch (e: SQLException){
            throw RuntimeException("Error al buscar el vehicuo con id $id", e)
        }
        return null
    }

    override fun save(item: Vehiculo): Vehiculo {
        val sql = "INSERT INTO vehiculos (matricula, marca, modelo, fechaMatriculacion, permisoActivo, tipo) VALUES(?,?,?,?,?,?)"
        try {
            getConnection().use { connection ->
                connection.prepareStatement(sql, arrayOf("id")).use { statement ->

                    statement.setString(1, vehiculo.marca)
                }
            }
        }
    }

    override fun update(id: Int, item: Vehiculo): Vehiculo? {
        TODO("Not yet implemented")
    }

    override fun delete(id: Int): Vehiculo? {
        TODO("Not yet implemented")
    }


}
