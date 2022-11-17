import models.*
import services.AlignmentStrategyFactory

class BookStatistics: Visitor {
    val aligmentStrategyFactory = AlignmentStrategyFactory("")

    var bookIncrement  = 0
    var sectionIncrement  = 0
    var tocIncrement  = 0
    var paragraphIncrement  = 0
    var imageProxyIncrement  = 0
    var imageIncrement  = 0
    var tableIncrement  = 0


    override fun visitBook(b: Book) {
        print(b.bt)
        this.bookIncrement++;
    }

    override fun visitSection(s: Section) {
        this.sectionIncrement++
    }

    override fun visitTableOfContents(toc: TableOfContents) {
        this.tocIncrement++
    }

    override fun visitParagraph(p: Paragraph) {
        this.paragraphIncrement++
    }

    override fun visitImageProxy(ip: ImageProxy) {
        this.imageProxyIncrement++
    }

    override fun visitImage(i: Image) {
        this.imageIncrement++
    }

    override fun visitTable(t: Table) {
        this.tableIncrement++;
    }

     fun printStatistics() {
         println("Book Statistics: ")
         println("***Number of images: $imageIncrement")
         println("***Number of tables: $tableIncrement")
         println("***Number of paragraphs: $paragraphIncrement")

     }
}