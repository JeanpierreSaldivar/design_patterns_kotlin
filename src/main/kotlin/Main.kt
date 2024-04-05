import creational.abstract_factory.FabricaDeMunecasPricesa
import creational.abstract_factory.FabricaDeRobotsEspacio
import creational.factory_method.SimplePizzaFactory
import creational.factory_method.TypePizza

fun main(args: Array<String>) {
    val fabricaRobots = FabricaDeRobotsEspacio()
    val fabricaMunecas = FabricaDeMunecasPricesa()

    val robotEspacio = fabricaRobots.crearRobot()
    val munecaPrincesa = fabricaMunecas.crearMuneca()

    robotEspacio.describir()
    robotEspacio.volar()
    munecaPrincesa.describir()
}