class Book {

    var author = Author()
    var title = String()
    var chapter = String()
    var chapters: MutableList<Chapter> = mutableListOf()

    constructor()

    constructor(title: String) {
        this.title = title
    }

    constructor(title: String, chapters: MutableList<Chapter>) {
        this.title = title
        this.chapters = chapters
    }

    fun addAuthor(author: Author) {
        this.author = author
    }

    fun createChapter(chapter: String) {
        this.chapter = chapter
    }

    fun getChapter(indexChapterOne: Unit) {
        return indexChapterOne
    }

    fun print() {
        print("Title: $this.title")
    }
}