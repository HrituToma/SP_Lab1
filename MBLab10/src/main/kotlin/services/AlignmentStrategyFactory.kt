package services

import models.AlignLeft
import models.AlignRight

class AlignmentStrategyFactory(StrategiesPrototypes: String){
    fun create(textAlignment: String) {
        when (textAlignment.substringAfterLast('.')) {
            "left" -> AlignLeft()
            "right" -> AlignRight()
            else -> throw Exception("I don't know how to deal with $textAlignment.")
        }
    }
}