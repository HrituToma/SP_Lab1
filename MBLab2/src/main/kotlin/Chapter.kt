class Chapter(private val chapterTitle: String) {
    
    private val subChapterList: MutableList<SubChapter>

    init {
        subChapterList = ArrayList()
    }

    fun print() {
        println(chapterTitle)
    }

    fun createSubChapter(subChapterName: String): Int {
        subChapterList.add(SubChapter(subChapterName))
        return subChapterList.size - 1
    }

    fun getSubChapter(subChapterIndex: Int): SubChapter {
        return subChapterList[subChapterIndex]
    }
}