fun main() {
    try {
        var OneB = Further(10, 80, "1Б", "Москва", 4, 14, 23)
        OneB.Price()
        println("Введите среднюю скорость поезда")
        var speed = readln()!!.toDouble()
        OneB.Speed(speed)
        OneB.Info() //вывод информации про прибытие, стоянку и время в пути
        OneB.path() //вывод информации о поезде
        OneB.Long()
        var L4 = Suburb(10, 10, "Л-4", "Красноуфимск", 0, 16, 9)
        L4.Time()
        L4.Price()
        println("Введите среднюю скорость поезда")
        speed = readln()!!.toDouble()
        L4.Speed(speed)
        L4.Info()
        L4.path()
        var T10 = Drive("T-10", "Ростов", 3, 23, 9)
        println("Введите среднюю скорость поезда")
        speed = readln()!!.toDouble()
        T10.Price()
        T10.Info()
        T10.path()
        T10.Speed(speed)
    } catch(e:Exception){
        println("неверный ввод")
    }
}
