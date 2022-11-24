class Salata(val nume: String, val pret: Double): Visitee {

    private val Restaurnat: String? = null
    private val Name: String? = null

    private val cost = 0.0


    override fun accept(visitor: Visitor) {
        visitor.vizitSalata(this, pret)
    }

    fun print() {
        println("Salata " + Name)
    }

    fun add(comanda: Comanda?) {}

    fun remove(comanda: Comanda?) {}

    operator fun get(i: Int): Comanda? {
        return null
    }


    fun getCostComanda(): Double? {
        return cost
    }

}