class Table(private val tableName: String) : Element() {
    override fun print() {
        println("Table with Title: $tableName")
    }
}