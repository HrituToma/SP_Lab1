package models

import Visitor

interface Element {

    fun add(e: Element) {}

    fun remove(e: Element) {}

    fun get(index: Int) {}

    fun accept(v: Visitor) {}

    fun print() {}

}