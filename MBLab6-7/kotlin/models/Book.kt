package models

import Visitor

class Book(Booktitle: String) : Section(Booktitle), Visitor {

    val bt = Booktitle

    val authors = mutableListOf<Author>()

    fun addAuthor(author: Author) {
        authors.add(author)
    }

    fun addContent(element: Element) {
        super.add(element)
    }

    override fun print() {
        for(a in authors) {
            println("Authors:")
            a.print()
        }
        super.print()
    }


    override fun visitBook(b: Book) {
        visitBook(this)
    }
}