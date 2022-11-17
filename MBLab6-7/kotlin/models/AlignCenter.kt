package models

import services.AlignStrategy

open class AlignCenter: AlignStrategy {

    override fun render(p: String) {
        println("##$p##")
    }

}