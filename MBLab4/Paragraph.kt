class Paragraph(paragraph: String) : Element {

    var p = paragraph

    override fun add(e: Element) {}

    override fun remove(e: Element) {}

    override fun get(index: Int) {}

    override fun print() {
        println("Paragraph: $p")
    }

}
