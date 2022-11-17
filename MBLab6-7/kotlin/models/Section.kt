package models

import BookStatistics
import Visitee
import Visitor

open class Section(title: String) : Element, Visitor, Visitee {

    var t = title
    val elements = mutableListOf<Element>()

    override fun add(e: Element) {
        elements.add(e)
    }

    override fun remove(e: Element) {}

    override fun get(index: Int) {}

//    override fun accept(v: BookStatistics) {
//        val bs = BookStatistics()
//    }

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