import Train.*
class Suburb (var stopCount: Int, var wagCount: Int, empNumber: String, empPoint: String, empDays: Int, empTimeA: Int, empTimeP: Int) : Drive(empNumber, empPoint, empDays, empTimeA, empTimeP){
    override fun SetPrice(){
        this.price = 225.0
    }
    override fun Speed(speed: Double) {
        if (speed < 45 || speed > 65){
            println("Скорость не входит в диапазон")
        }
        else {
            println("Скорость поезда: ${speed}")
        }
    }
    override fun path() {
        if (wagCount >= 4 || stopCount >= 3){
            println("Пригородный поезд с номером ${number}, с количеством вагонов: ${wagCount}")
            println("Пункт назначения: ${point}, количество отсановок ${stopCount}")
        }
        else {
            println("неверные данные")
        }
    }
}
