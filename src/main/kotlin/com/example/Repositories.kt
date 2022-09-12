package com.example

import org.springframework.data.repository.CrudRepository

interface BookRepository : CrudRepository<Book,Long>{

    fun findByTitle(title : String) : Book
}