fun main(args: Array<String>) {
    val discoTitanic = Book("Disco Titanic")
    val rpGheo = Author("Radu Pavel Gheo")

    discoTitanic.addAuthor(rpGheo)
    val indexChapterOne = discoTitanic.createChapter("Capitolul 1")
    val chp1 = discoTitanic.getChapter(indexChapterOne)
    val indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1")
    val scOneOne = chp1.getSubChapter(indexSubChapterOneOne)

    scOneOne.createNewParagraph("Paragraph 1")
    scOneOne.createNewParagraph("Paragraph 2")
    scOneOne.createNewParagraph("Paragraph 3")
    scOneOne.createNewImage("Image 1")
    scOneOne.createNewParagraph("Paragraph 4")
    scOneOne.createNewTable("Table 1")
    scOneOne.createNewParagraph("Paragraph 5")
    scOneOne.print()
}