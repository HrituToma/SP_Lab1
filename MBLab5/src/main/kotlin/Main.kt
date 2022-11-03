fun main(args: Array<String>) {
    val cap1 = Section("Capitolul 1")
    val p1 = Paragraph("Paragraph 1")
    cap1.add(p1)
    val p2 = Paragraph("Paragraph 2")
    cap1.add(p2)
    val p3 = Paragraph("Paragraph 3")
    cap1.add(p3)
    val p4 = Paragraph("Paragraph 4")
    cap1.add(p4)
    println("Printing without Alignment")
    println()
    cap1.print()
    p1.setAlignStrategy(AlignCenter())
    p2.setAlignStrategy(AlignRight())
    p3.setAlignStrategy(AlignLeft())
    println()
    println("Printing with Alignment")
    println()
    cap1.print()
}