open class Section(title: String) : Element {

    var t = title
    val elements = mutableListOf<Element>()

    override fun add(e: Element) {
        elements.add(e)
    }

    override fun remove(e: Element) {}

    override fun get(index: Int) {}

    override  fun print() {
        println(t)
        for(el in elements) {
            el.print()
        }
    }


}
