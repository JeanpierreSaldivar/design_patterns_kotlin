package creational.factory_method

class PepperoniPizza : Pizza {
    override fun prepare() {
        println("Preparing Pepperoni Pizza")
    }

    override fun bake() {
        println("Baking Pepperoni Pizza")
    }

    override fun cut() {
        println("Cutting Pepperoni Pizza")
    }

    override fun box() {
        println("Boxing Pepperoni Pizza")
    }
}