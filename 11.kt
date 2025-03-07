import Train.Drive as NewTrain
fun main() {
    try {
        var OneB = Further(10, 80, "1Б", "Москва", 4, 14, 23)
        OneB.SetPrice(15.0)
        println("Введите скорость поезда")
        var speed = readln()!!.toDouble()
        OneB.Speed(speed)
        OneB.Info() //вывод информации про прибытие, стоянку и время в пути
        OneB.path() //вывод информации о поезде
        var L4 = Suburb(10, 10, "Л-4", "Красноуфимск", 0, 16, 9)
        L4.SetPrice()
        println("Введите скорость поезда")
        speed = readln()!!.toDouble()
        L4.Speed(speed)
        L4.Info()
        L4.path()
        var T10 = NewTrain("T-10", "Ростов", 3, 23, 9)
        println("Введите скорость поезда")
        speed = readln()!!.toDouble()
        T10.Info()
        T10.path()
        T10.Speed(speed)
    } catch(e:Exception){
        println("неверный ввод")
    }
}
