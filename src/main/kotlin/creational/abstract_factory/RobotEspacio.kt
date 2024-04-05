package creational.abstract_factory

class RobotEspacio : Robot {
    override fun describir() {
        println("Este es un Robot de Espacio.")
    }

    override fun volar() {
        println("Este es un Robot de Espacio volando.")
    }
}