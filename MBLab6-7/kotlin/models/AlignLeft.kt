package models

import services.AlignStrategy

open class AlignLeft: AlignStrategy {

    override fun render(p: String) {
        println("$p##")
    }

}