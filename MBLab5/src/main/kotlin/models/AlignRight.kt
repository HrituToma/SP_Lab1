package models

import services.AlignStrategy

open class AlignRight: AlignStrategy {

    override fun render(p: String) {
        println("##$p")
    }

}