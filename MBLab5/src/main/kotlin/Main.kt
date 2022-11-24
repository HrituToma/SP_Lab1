import models.*
import services.TableOfContentsVisitor


fun main(args: Array<String>) {
    val cap1 = Section("Capitolul 1")
    val p1 = Paragraph("Paragraph 1")
    cap1.add(p1)
    val p2 = Paragraph("Paragraph 2")
    cap1.add(p2)
    val p3 = Paragraph("Paragraph 3")
    cap1.add(p3)
    cap1.add(Section("Capitolul 2"))
    val p4 = Paragraph("Paragraph 4")
    cap1.add(p4)
    cap1.add(ImageProxy("ImageOne"))
    cap1.add(Image("ImageTwo"))
    cap1.add(Paragraph("Some text"))
    cap1.add(Table("Table 1"))
    cap1.add(Section("Capitolul 3"))
    val v = TableOfContentsVisitor()
    cap1.accept(v)
    cap1.add(v.getToc())
    cap1.print()
}