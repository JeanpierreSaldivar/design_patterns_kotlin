package creational.abstract_factory

class FabricaDeMunecasPricesa : FabricaDeMunecas {
    override fun crearMuneca(): Muneca = MunecaPricesa()
}