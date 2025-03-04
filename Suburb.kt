import Train.*
class Suburb (var stopCount: Int, var wagCount: Int, empNumber: String, empPoint: String, empDays: Int, empTimeA: Int, empTimeP: Int) : Drive(empNumber, empPoint, empDays, empTimeA, empTimeP){
    private var price: Double = 445.5
    public fun GetPrice(): Double{
        return price
    }
    public fun SetPrice(price: Double){
        if (price < 0){
            println("Цена не может быть отрицательной")
        }
        else{
            this.price = price
        }
    }
    override fun path() {
        println("Пригородный поезд с номером ${number}, с количеством вагонов: ${wagCount}")
        println("Пункт назначения: ${point}, количество отсановок ${stopCount}")
    }
}