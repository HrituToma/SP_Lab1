package models

import Visitee

open class Section(title: String) : Element {

    var t = title
    val elements = mutableListOf<Element>()

    override fun add(e: Element) {
        elements.add(e)
    }

    override fun remove(e: Element) {}

    override fun get(index: Int) {}

    fun getTitle(): String {
        return t
    }

    override  fun print() {
        println(t)
        for(el in elements) {
            el.print()
        }
    }

    override fun accept(v: Visitor) {
        v.visitSection(this)
        for(e in elements)  {
            e.accept(v)
        }
    }

}