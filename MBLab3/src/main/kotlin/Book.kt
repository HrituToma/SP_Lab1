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
        println("Book: $bt")
        println("Authors: ")
        for(author in authors) {
            print("Author: ")
            author.print()
            println()
        }
        super.print()
    }
}