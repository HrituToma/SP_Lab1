import models.Author
import models.Book
import models.Paragraph
import models.Section
import services.DocumentManager

fun main() {
    val myBook = Book("My Book");
    DocumentManager.getInstance().setBook(myBook)
    val me  = Author("My self")
    myBook.addAuthor(me)
    val cap1 = Section("Capitol 1")
    myBook.addContent(cap1)
    val p1 = Paragraph("Paragraph 1")
    cap1.add(p1)

    printing()
}

fun printing() {
    DocumentManager.getInstance().getBook().print()
}