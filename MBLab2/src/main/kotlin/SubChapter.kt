class SubChapter(private val subchapterName: String) {
   
    private val elementList: MutableList<Element>

    init {
        elementList = ArrayList()
    }

    fun createNewParagraph(paragraphName: String) {
        elementList.add(Paragraph(paragraphName))
    }

    fun createNewImage(imageName: String) {
        elementList.add(Image(imageName))
    }

    fun createNewTable(tableName: String) {
        elementList.add(Table(tableName))
    }

    fun print() {
        println("Subchapter: $subchapterName")
        elementList.forEach(Element::print)
    }
}