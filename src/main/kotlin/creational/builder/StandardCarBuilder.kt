package creational.builder

class StandardCarBuilder : CarBuilder {
    private var brand : String ?= null
    private var model : String ?= null
    private var hasGPS : Boolean = false

    override fun setBrand(brand: String): CarBuilder {
        this.brand = brand
        return this
    }

    override fun setModel(model: String): CarBuilder {
        this.model = model
        return this
    }

    override fun setGPS(hasGPS: Boolean): CarBuilder {
        this.hasGPS = hasGPS
        return this
    }

    override fun build(): Car {
        return Car(brand,model,hasGPS)
    }

}