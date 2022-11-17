import models.*

fun main(args: Array<String>) {
    val cap1 = Section("Capitolul 1")
    val p1 = Paragraph("models.Paragraph 1")
    cap1.add(p1)
    val p2 = Paragraph("models.Paragraph 2")
    cap1.add(p2)
    val p3 = Paragraph("models.Paragraph 3")
    cap1.add(p3)
    val p4 = Paragraph("models.Paragraph 4")
    cap1.add(p4)
    cap1.add(ImageProxy("ImageOne"))
    cap1.add(Image("ImageTwo"))
    cap1.add(Paragraph("Some text"))
    cap1.add(Table("models.Table 1"))
    val stats = BookStatistics()
    cap1.accept(stats)
    stats.printStatistics()
}