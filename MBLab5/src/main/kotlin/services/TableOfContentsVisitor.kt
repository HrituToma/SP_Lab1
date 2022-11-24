package services

import models.*


class TableOfContentsVisitor: Visitor {
    val tableOfContents = TableOfContents()
    var count = 1


    fun getToc(): TableOfContents {
        return tableOfContents
    }

    override fun visitBook(b: Book) {
    }

    override fun visitSection(s: Section) {
        tableOfContents.add(s.getTitle(), count)
    }

    override fun visitTableOfContents(toc: TableOfContents) {
    }

    override fun visitParagraph(p: Paragraph) {
        count++
    }

    override fun visitImageProxy(ip: ImageProxy) {
        count++
    }

    override fun visitImage(i: Image) {
        count++
    }

    override fun visitTable(t: Table) {
        count++
    }
}