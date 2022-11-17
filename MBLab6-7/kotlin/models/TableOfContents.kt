package models

import Visitor

class TableOfContents : Element, Visitor {
    override fun print() {}

    override fun accept(v: Visitor) {
    }
}