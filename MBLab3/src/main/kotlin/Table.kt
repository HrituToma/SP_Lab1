class Table(table: String) : Element {

    var t = table
    override fun add(e: Element) {}

    override fun remove(e: Element) {}

    override fun get(index: Int) {}

    override fun print() {
        println("Table: $t")
    }
}