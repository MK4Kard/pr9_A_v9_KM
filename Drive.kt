package Train
open class Drive (var number: String, var point: String, var days: Int, var timeArr: Int, var timePark: Int){
    var speed: Double = 50.0
    var price: Double = 345.5
    open fun path() {
        println("Поезд с номером $number\n" +
                "Пункт назначения: $point")
    }

    open fun Info() {
        if ((timeArr >= 1 && timePark >= 1) || (timeArr <= 23 && timePark <= 23)){
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

    open fun SetPrice(price: Double){
        if (price < 0){
            println("Цена не может быть отрицательной")
        }
        else{
            this.price = price
        }
    }

    open fun Speed(speed: Double) {
        if (speed < 35 || speed > 55){
            println("Скорость не входит в диапазон")
        }
        else {
            println("Скорость поезда: ${speed}")
        }
    }
}
