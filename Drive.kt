package Train
open class Drive (var number: String, var point: String, var days: Int, var timeArr: Int, var timePark: Int){

    open fun Speed(speed: Double) {
        if (speed < 45 || speed > 65){
            println("Скорость не входит в диапазон")
        }
        else {
            println("Скорость поезда: ${speed}")
        }
    }

    open fun path() {
        println("Поезд с номером $number\n" +
                "Пункт назначения: $point")
    }

    open fun Info() {
        if (days != 0){
            println("Дней в пути: $days\n" +
                    "Время прибытия - $timeArr; Время стоянки - $timePark")
        }
        else {
            println("Время прибытия - $timeArr; Время стоянки - $timePark")
        }
    }
}
