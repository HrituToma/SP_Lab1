open class Image(url: String) : Element, Picture {


    var u = url

    val elements = mutableListOf<Element>()

    override fun add(e: Element) {
        elements.add(e)
    }

    override fun remove(e: Element) {}

    override fun get(index: Int) {}

    override fun url() {}

    override fun dim() {}

    override fun content() {}

    override fun print() {
        println("Image with name: $u")
    }
}