package models

import Visitee
import Visitor
import services.AlignStrategy

class Paragraph(paragraph: String) : Element, Visitor, Visitee {

    var p = paragraph

    private var alignStrategy: AlignStrategy? = null

    override fun add(e: Element) {}

    override fun remove(e: Element) {}

    override fun get(index: Int) {}

    fun setAlignStrategy(alignStrategy: AlignStrategy) {
        this.alignStrategy = alignStrategy
    }

    override fun print() {
        if (alignStrategy == null) {
            println("models.Paragraph: $p")
        } else {
            alignStrategy!!.render(p)
        }
    }

    override fun accept(v: Visitor) {
        v.visitParagraph(this)
    }

}