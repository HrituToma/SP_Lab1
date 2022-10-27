fun main(args: Array<String>) {
    var startTime = System.currentTimeMillis()
    val img1 = Image("Pamela Anderson")
    val img2 = Image("Kim Kardashian")
    val img3 = Image("Kirby Griffin")
    val playboyS1 = Section("Front Cover")
    playboyS1.add(img1)
    val playboyS2 = Section("Summer Girls")
    playboyS2.add(img2)
    playboyS2.add(img3)
    val playboy = Book("Playboy")
    playboy.addContent(playboyS1)
    playboy.addContent(playboyS2)
    var endTime = System.currentTimeMillis()
    println(
        "Creation of the content took " + (endTime -
                startTime) + " milliseconds"
    )
    startTime = System.currentTimeMillis()
    playboyS1.print()
    endTime = System.currentTimeMillis()
    println(
        "Printing of the section 1 took " + (endTime -
                startTime) + " milliseconds"
    )
    startTime = System.currentTimeMillis()
    playboyS1.print()
    endTime = System.currentTimeMillis()
    println(
        "Printing again the section 1 took " + (endTime -
                startTime) + " milliseconds"
    )
}

//fun main(args: Array<String>) {
//    val noapteBuna = Book("Noapte buna, copii!")
//    val rpGheo = Author("Radu Pavel Gheo")
//    noapteBuna.addAuthor(rpGheo)
//    val cap1 = Section("Capitolul 1")
//    val cap11 = Section("Capitolul 1.1")
//    val cap111 = Section("Capitolul 1.1.1")
//    val cap1111 = Section("Subchapter 1.1.1.1")
//    noapteBuna.addContent(Paragraph("Multumesc celor care ..."))
//    noapteBuna.addContent(cap1)
//    cap1.add(Paragraph("Moto capitol"))
//    cap1.add(cap11)
//    cap11.add(Paragraph("Text from subchapter 1.1"))
//    cap11.add(cap111)
//    cap111.add(Paragraph("Text from subchapter 1.1.1"))
//    cap111.add(cap1111)
//    cap1111.add(Image("Image subchapter 1.1.1.1"))
//    noapteBuna.print()
//}