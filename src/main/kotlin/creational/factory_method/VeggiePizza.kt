package creational.factory_method

class VeggiePizza : Pizza {
    override fun prepare() {
        println("Preparing Veggie Pizza")
    }

    override fun bake() {
        println("Baking Veggie Pizza")
    }

    override fun cut() {
        println("Cutting Veggie Pizza")
    }

    override fun box() {
        println("Boxing Veggie Pizza")
    }
}