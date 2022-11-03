open class ImageProxy(url: String): Element, Picture {

    val image = Image(url)

    val elements = mutableListOf<Element>()

    override fun add(e: Element) {
        elements.add(e)
    }

    override fun remove(e: Element) {}

    override fun get(index: Int) {}

    override fun print() {
        for(e in elements) {
            e.print()
        }
    }

    fun loadImage() {}


}