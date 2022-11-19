package models

class Book(Booktitle: String) : Section(Booktitle) {

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
}