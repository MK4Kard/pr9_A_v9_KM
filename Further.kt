class Further(var typeWag: Int, var tickSale: Int, empNumber: String, empPoint: String, empDays: Int, empTimeA: Int, empTimeP: Int) : Drive(empNumber, empPoint, empDays, empTimeA, empTimeP) {
    var price1: Double = 35.5
    var lenght: Double = 50.0
    var speed: Double = 1.0
    fun Long(){
        lenght = (days*24) * speed
        println("Длина пути: ${lenght} м")
    }
    override fun Price(){
        this.price = days * price1
    }
    override fun Speed(speed: Double) {
        if (speed < 45 || speed > 85){
            println("Скорость не входит в диапазон")
        }
        else {
            println("Средняя скорость поезда: ${speed}")
            this.speed = speed
        }
    }
    override fun path() {
        println("Дальний поезд с номером ${number}, с разновидностью вагонов: ${typeWag}")
        println("Пункт назначения: ${point}")
        println("Цена 1 билета: ${price}, билеты появляются за ${tickSale} дней")
    }
}
