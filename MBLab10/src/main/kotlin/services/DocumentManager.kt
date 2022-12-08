package services

import models.Book

class DocumentManager private constructor() {


    companion object {
        @Volatile
        private lateinit var instance: DocumentManager

        //lateinit var book: Book
        private lateinit var book: Book


        fun getInstance(): DocumentManager {
            synchronized(this) {
                if (!Companion::instance.isInitialized) {
                    instance = DocumentManager()
                }
                return instance
            }
        }
    }

    fun setBook(myBook: Book) {
        book = myBook;
    }

    fun getBook(): Book {
        return book
    }

    fun show() {
        println("Singleton");
    }

}