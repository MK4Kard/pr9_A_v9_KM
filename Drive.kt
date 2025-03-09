open class Drive (var number: String, var point: String, var days: Int, var timeArr: Int, var timePark: Int){
    var price: Double = 35.5
    open fun Price(){
        price *= 10
    }

    open fun path() {
        println("Поезд с номером $number\n" +
                "Пункт назначения: $point")
    }

    open fun Info() {
        if ((timeArr >= 1 && timePark >= 1)&&(timeArr < 24 && timePark < 24)){
            if (days > 0){
                println("Дней в пути: $days\n" +
                        "Время прибытия - $timeArr; Время стоянки - $timePark")
            }
            else {
                println("Время прибытия - $timeArr; Время стоянки - $timePark")
            }
        }
        else {
            println("неверные данные")
        }
    }

    open fun Speed(speed: Double) {
        if (speed < 35 || speed > 55){
            println("Скорость не входит в диапазон")
        }
        else {
            println("Средняя скорость поезда: ${speed}")
        }
    }
}
