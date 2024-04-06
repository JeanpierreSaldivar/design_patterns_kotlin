package creational.builder

interface CarBuilder {
    fun setBrand(brand : String) : CarBuilder
    fun setModel(model : String) : CarBuilder
    fun setGPS(hasGPS : Boolean) : CarBuilder
    fun build() : Car
}