class Chapter {

    var book = Book()
    var name = String()
    var subchapter = String()
    var subChapters: MutableList<SubChapter> = mutableListOf()

    constructor()

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, subChapters: MutableList<SubChapter>) {
        this.name = name
        this.subChapters = subChapters
    }

    fun createSubChapter(subchapter: String) {
        this.subchapter = subchapter
    }

    fun print() {
        print("Chapter: $this.name")
    }
}