import java.util.concurrent.TimeUnit

class Image(url: String) : Element {

    var u = url
    override fun add(e: Element) {}

    override fun remove(e: Element) {}

    override fun get(index: Int) {}

    override fun print() {
        println("Image with name: $u")
    }
}