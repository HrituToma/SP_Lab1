class ComandaStatistics : Visitor {

    var costTotal = 0.0
    var costPizza = 0.0
    var costPaste = 0.0
    var costSalata = 0.0

    override fun visitPizza(pizza: Pizza?, cost: Double?) {
        if (pizza != null) {
            println("${pizza.nume} - $cost")
        }
        if (cost != null) {
            costPizza+=cost
        };
    }

    override fun visitPaste(paste: Paste?, cost: Double?) {
        if (paste != null) {
            println("${paste.nume} - $cost")
        }
        if (cost != null) {
            costPaste+= cost
        };
    }

    override fun vizitSalata(salata: Salata?, cost: Double?) {
        if (salata != null) {
            println("${salata.nume} - $cost")
        }
        if (cost != null) {
            costSalata += cost
        }
    }

    override fun visitSubComanda(subComanda: SubComanda?, cost: Double?) {
        if (cost != null) {
            costTotal += cost
        };
        println("$subComanda - $cost")
    }

    fun getComandaStatistics() {
        println("Total : $costTotal")
        println("Pizza : $costPizza")
        println("Salate : $costSalata")
        println("Paste : $costPaste")
    }

}