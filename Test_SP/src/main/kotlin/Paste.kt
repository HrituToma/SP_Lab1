class Paste(val nume: String, val pret: Double) : Visitee {

    private val Restaurant: String? = nume
    private val Name: String? = null
    private val cost = 0.0

    override fun accept(visitor: Visitor) {
        visitor.visitPaste(this, pret)
    }

    fun print() {
        println("Paste" + Name)
    }

    fun add(comanda: Comanda?) {}

    fun remove(comanda: Comanda?) {}

    operator fun get(i: Int): Comanda? {
        return null
    }


    fun getCostComanda(): Double? {
        return cost
    }

    override fun toString(): String {
        return "Paste(nume='$nume', pret=$pret, Restaurant=$Restaurant, Name=$Name, cost=$cost)"
    }


}