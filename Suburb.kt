class Suburb (var stopCount: Int, var wagCount: Int, empNumber: String, empPoint: String, empDays: Int, empTimeA: Int, empTimeP: Int) : Drive(empNumber, empPoint, empDays, empTimeA, empTimeP){
    var price1: Double = 35.5
    var time = 1
    override fun Price(){
        this.price = time * price1
    }
    fun Time(){
        if (timePark > timeArr){
            time = timePark - timeArr
        }
        else if (timeArr > timePark){
            time = timeArr - timePark
        }
        else {
            time = 1
        }
    }

    override fun Speed(speed: Double) {
        if (speed < 45 || speed > 65){
            println("Скорость не входит в диапазон")
        }
        else {
            println("Средняя скорость поезда: ${speed}")
        }
    }
    override fun path() {
        if (wagCount >= 4 && stopCount >= 3){
            println("Пригородный поезд с номером ${number}, с количеством вагонов: ${wagCount}")
            println("Пункт назначения: ${point}, количество отсановок ${stopCount}")
            println("Цена 1 билета: ${price}")
        }
        else {
            println("неверные данные")
        }
    }
    override fun Info() {
        if ((timeArr >= 1 && timePark >= 1) && (timeArr < 24 && timePark < 24)) {
            println(
                "Время прибытия - $timeArr; Время стоянки - $timePark\n" +
                        "Время в пути: ${time}"
            )
        } else {
            println("неверные данные")
        }
    }
}
