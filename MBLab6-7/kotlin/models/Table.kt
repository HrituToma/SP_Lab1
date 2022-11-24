package models

import Visitee
import Visitor

class Table(table: String) : Element, Visitee, Visitor {

    var t = table
    override fun add(e: Element) {}

    override fun remove(e: Element) {}

    override fun get(index: Int) {}

    override fun print() {
        println("models.Table: $t")
    }

    override fun accept(v: Visitor) {
        v.visitTable(this)

    }



}