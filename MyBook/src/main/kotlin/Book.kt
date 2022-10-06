class Book(var title: String) {

    var paragraphs: MutableList<String> = mutableListOf()
    var images: MutableList<String> = mutableListOf()
    var tables: MutableList<String> = mutableListOf()

    fun createNewParagraph(paragraph: String) {
        paragraphs.add(paragraph)
    }

    fun createNewImage(image: String) {
        images.add(image)
    }

    fun createNewTable(table: String) {
        tables.add(table)
    }

    fun print() {
        print("Book(title=$title,paragraphs=$paragraphs, images=$images, tables=$tables)")
    }

}