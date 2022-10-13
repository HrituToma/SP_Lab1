class Image {

    var image = String()

    constructor()

    constructor(image: String) {
        this.image = image
    }

    fun print() {
        print("Image: $image")
    }
}