import creational.abstract_factory.FabricaDeMunecasPricesa
import creational.abstract_factory.FabricaDeRobotsEspacio
import creational.builder.StandardCarBuilder
import creational.factory_method.SimplePizzaFactory
import creational.factory_method.TypePizza

fun main() {
    val car = StandardCarBuilder()
        .setBrand("Toyota")
        .setModel("Corolla")
        .setGPS(true)
        .build()

    val car2 = StandardCarBuilder()
        .setBrand("Toyota")
        .setModel("Corolla")
        .setGPS(false)
        .build()

    println(car)
    println(car2)
}