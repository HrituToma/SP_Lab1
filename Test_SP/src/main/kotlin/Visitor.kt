interface Visitor {
    fun visitPizza(pizza: Pizza?, cost: Double?)
    fun visitPaste(paste: Paste?, cost: Double?)
    fun vizitSalata(salata: Salata?, cost: Double?)
    fun visitSubComanda(subComanda: SubComanda?, cost: Double?)

}