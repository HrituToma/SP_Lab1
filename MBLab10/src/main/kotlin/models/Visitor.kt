package models

import models.*

interface Visitor {
    fun visitBook(b: Book) {}

    fun visitSection(s: Section) {}

    fun visitTableOfContents(toc: TableOfContents) {}

    fun visitParagraph(p: Paragraph) {}

    fun visitImageProxy(ip: ImageProxy) {}

    fun visitImage(i: Image) {}

    fun visitTable(t: Table) {}

}