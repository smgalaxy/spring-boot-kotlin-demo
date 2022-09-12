package com.example

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController (val bookRepository: BookRepository)
{
    @PostMapping("/book")
    fun addBooks(@RequestBody book: Book) = bookRepository.save(book)

//    @GetMapping("/book")
//    fun getAllBooks() : List<Book>
//    {
//        return bookRepository.findAll().toList()
//    }
    @GetMapping("/book")
    fun getAllBooks() = bookRepository.findAll().toList()
    @GetMapping("/book/{title}")
    fun getBookByTitle(@PathVariable("title") title : String) : Book = bookRepository.findByTitle(title)

}