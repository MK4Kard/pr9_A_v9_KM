import Train.*
class Further(var typeWag: Int, var tickSale: Int, empNumber: String, empPoint: String, empDays: Int, empTimeA: Int, empTimeP: Int) : Drive(empNumber, empPoint, empDays, empTimeA, empTimeP) {
    private var price: Double = 645.5
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
        println("Дальний поезд с номером ${number}, с разновидностью вагонов: ${typeWag}")
        println("Пункт назначения: ${point}")
        println("Цена 1 билета: ${price}, билеты появляются за ${tickSale} дней")
    }
}
