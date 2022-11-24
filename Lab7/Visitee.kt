import models.Visitor

interface Visitee {

    fun accept(v: Visitor) {}

}