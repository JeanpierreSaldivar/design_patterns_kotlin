package creational.abstract_factory

class FabricaDeRobotsEspacio : FabricaDeRobots {
    override fun crearRobot(): Robot = RobotEspacio()
}