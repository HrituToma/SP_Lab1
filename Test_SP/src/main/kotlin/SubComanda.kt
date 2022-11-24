class SubComanda(private val NumeComanda: String) : Comanda, Visitee {

    private val SubComenzi: MutableList<Comanda?>
    private var cost: Double? = 0.0

    init {
        SubComenzi = ArrayList()
    }

    override fun add(comanda: Comanda?) {
        SubComenzi.add(comanda)
    }

    override fun remove(comanda: Comanda?) {
        SubComenzi.remove(comanda)
    }

    override fun get(i: Int): Comanda? {
        return SubComenzi[i]
    }

    override fun accept(vizitor: Visitor) {
        cost = 0.0
        for (comanda in SubComenzi) {
            if (comanda != null) {
                comanda.accept(vizitor)
            }
            if (comanda != null) {
                cost = cost!! + comanda.getCostComanda()!!
            }
            if (comanda != null) {
                println(comanda.getCostComanda().toString() + " $NumeComanda")
            }
        }
        vizitor.visitSubComanda(this, cost)
    }

    override fun getCostComanda(): Double? {
        for (comanda in SubComenzi) {
            cost = cost!! + comanda!!.getCostComanda()!!
            println("In for $comanda")
        }
        return cost
    }

    override fun print() {
        println(NumeComanda)
        for (comanda in SubComenzi) {
            comanda!!.print()
        }
    }
}