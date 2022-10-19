class Paragraph(private val paragraphContent: String) : Element() {
    override fun print() {
        println("Paragraph: $paragraphContent")
    }
}