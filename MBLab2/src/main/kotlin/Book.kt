class Book(private val bookTitle: String) {
    
    private var bookAuthor: Author? = null
    private val chapterList: MutableList<Chapter>

    init {
        chapterList = ArrayList()
    }

    fun addAuthor(bookAuthor: Author?) {
        this.bookAuthor = bookAuthor
    }

    fun createChapter(chapterTitle: String): Int {
        chapterList.add(Chapter(chapterTitle))
        return chapterList.size - 1
    }

    fun getChapter(chapterIndex: Int): Chapter {
        return chapterList[chapterIndex]
    }
}