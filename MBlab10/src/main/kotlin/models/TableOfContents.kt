package models


class TableOfContents : Element {
    private val lista = mutableListOf<String>()

    //override fun add(e: Element) {}

    fun add(e: String, page: Int) {
        lista.add(e + " pag." + page.toString());
    }


    override fun print() {
        for(i in lista) {
            println(i)
        }
    }

    override fun accept(v: Visitor) {
        v.visitTableOfContents(this)
    }
}