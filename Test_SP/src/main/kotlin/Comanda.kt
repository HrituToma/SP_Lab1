interface Comanda {

    fun print()
    fun add(comanda: Comanda?)
    fun remove(comanda: Comanda?)
    operator fun get(i: Int): Comanda?
    fun accept(visitor: Visitor)
    fun getCostComanda(): Double?

}