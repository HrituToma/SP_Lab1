package models

class Author(s: String) {
    var name = s

    fun print() {
        println("models.Author: $name")
    }
}