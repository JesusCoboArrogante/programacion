package org.example.crud

interface CrudRepository<T,ID> {

    fun findAllby():List<T>
    fun FindByID(id: ID):T?
    fun save (item:T):T
    fun update(id: ID,item: T):T?
    fun delete(id: ID):T?

}