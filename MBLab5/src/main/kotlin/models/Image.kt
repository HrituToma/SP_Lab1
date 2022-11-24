package models

import Visitee
import services.ImageLoaderFactory

open class Image(url: String) : Element, Picture {

    val imageLoader = ImageLoaderFactory()

    var u = url

    val elements = mutableListOf<Element>()

    override fun add(e: Element) {
        elements.add(e)
    }

    override fun remove(e: Element) {}

    override fun get(index: Int) {}

    override fun url() {}

    override fun dim() {}

    override fun content() {}

    fun loadImage() {}

    override fun print() {
        println("models.Image with name: $u")
    }

    override fun accept(v: Visitor) {
        v.visitImage(this)
    }

}