fun main(args: Array<String>) {
    var startTime = System.currentTimeMillis()
    val img1 = ImageProxy("Pamela Anderson")
    val img2 = ImageProxy("Kim Kardashian")
    val img3 = ImageProxy("Kirby Griffin")
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