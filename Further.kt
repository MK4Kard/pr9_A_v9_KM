import Train.*
class Further(var typeWag: Int, var tickSale: Int, empNumber: String, empPoint: String, empDays: Int, empTimeA: Int, empTimeP: Int) : Drive(empNumber, empPoint, empDays, empTimeA, empTimeP) {
    var price1: Double = 35.5
    fun Wag(wag: Int) {
        if (wag >= 2 || wag < 20){
            this.typeWag = wag
        }
        else {
            println("Число разновидности вагонов не соответствует норме")
        }
    }

    fun Sale(sale: Int) {
        if (sale < 5 || sale > 150) {
            this.tickSale = sale
        }
        else {
            println("Появление билетов задано не правильно")
        }
    }

    override fun SetPrice(price: Double){
        this.price = days * price1
    }
    override fun Speed(speed: Double) {
        if (speed < 45 || speed > 85){
            println("Скорость не входит в диапазон")
        }
        else {
            println("Скорость поезда: ${speed}")
        }
    }
    override fun path() {
        println("Дальний поезд с номером ${number}, с разновидностью вагонов: ${typeWag}")
        println("Пункт назначения: ${point}")
        println("Цена 1 билета: ${price}, билеты появляются за ${tickSale} дней")
    }
}
