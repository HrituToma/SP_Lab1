object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val discoTitanic = Book("Disco Titanic")
        val autorulCartii = Author("Radu Pavel Gheo")
        discoTitanic.addAuthor(autorulCartii)
        val indexulPrimuluiCapitol: Int = discoTitanic.createChapter("Capitolul 1")
        val primulCapitol: Chapter = discoTitanic.getChapter(indexulPrimuluiCapitol)
        val indexulPrimuluiSubCapitol: Int = primulCapitol.createSubChapter("Subcapitolul 1.1")
        val primulSubCapitol: SubChapter = primulCapitol.getSubChapter(indexulPrimuluiSubCapitol)
        primulSubCapitol.createNewParagraph("Paragraph 1")
        primulSubCapitol.createNewParagraph("Paragraph 2")
        primulSubCapitol.createNewParagraph("Paragraph 3")
        primulSubCapitol.createNewParagraph("Paragraph 4")
        primulSubCapitol.createNewImage("Image 1")
        primulSubCapitol.createNewTable("Table 1")
        primulSubCapitol.createNewParagraph("Paragraph 5")
        primulSubCapitol.print()
    }
}