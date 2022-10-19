class Image(private val imageName: String) : Element() {
    override fun print() {
        println("Image with name: $imageName")
    }
}