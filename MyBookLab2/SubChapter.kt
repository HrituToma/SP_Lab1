class SubChapter {

    var name = String()
    var paragraph = String()
    var image = String()
    var table = String()

    var images: MutableList<Image> = mutableListOf()
    var paragraphs: MutableList<Paragraph> = mutableListOf()
    var tables: MutableList<Table> = mutableListOf()
    //TODO o singura lista, class Element?

    constructor()

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, images: MutableList<Image>, paragraphs: MutableList<Paragraph>, tables: MutableList<Table>) {
        this.name = name
        this.images = images
        this.paragraphs = paragraphs
        this.tables = tables
    }

    fun createNewParagraph(paragraph: String) {
        this.paragraph = paragraph
    }

    fun print() {
        print("Sub chapter: $this.name/ Images: $images/ Paragraphs: $paragraphs/ Tables: $tables")
    }

    fun createNewImage(image: String) {
        this.image = image
    }

    fun createNewTable(table: String) {
        this.table = table
    }
}