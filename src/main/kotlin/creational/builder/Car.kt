package creational.builder

class Car(
    var brand : String? = null,
    var model : String? = null,
    var hasGPS : Boolean? = null,
) {
    override fun toString(): String {
        return "Car(brand='$brand', model='$model', hasGPS='$hasGPS')"
    }
}