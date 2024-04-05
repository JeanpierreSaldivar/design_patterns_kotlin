package creational.factory_method

abstract class PizzaFactory {
    abstract fun createPizza(typePizza: TypePizza): Pizza
    fun orderPizza(typePizza: TypePizza): Pizza{
        val pizza = createPizza(typePizza)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}

class SimplePizzaFactory : PizzaFactory(){
    override fun createPizza(typePizza: TypePizza): Pizza {
        return when(typePizza){
            TypePizza.PEPPERONI -> PepperoniPizza()
            TypePizza.VEGGIE -> VeggiePizza()

        }
    }

}