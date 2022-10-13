class Author {

    var name = String()
    var books: MutableList<Book> = mutableListOf()

    constructor()

    constructor(name: String) {
        this.name = name
    }

    fun print() {
        print("Author: $name")
    }
}