class Pizza(val nume: String, val pret: Double) : Visitee {

    private val Restaurnat: String? = null
    private val Name: String? = null
    private val cost = 0.0

    fun print() {
        println("Pizza " + Name)
    }

    fun add(comanda: Comanda?) {}

    fun remove(comanda: Comanda?) {}

    operator fun get(i: Int): Comanda? {
        return null
    }

    override fun accept(visitor: Visitor) {
        visitor.visitPizza(this, cost)
    }

    fun getCostComanda(): Double? {
        return cost
    }

    override fun toString(): String {
        return "Pizza(nume='$nume', pret=$pret, Restaurnat=$Restaurnat, Name=$Name, cost=$cost)"
    }


}