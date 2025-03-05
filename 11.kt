import Train.Drive as NewTrain
fun main() {
    var OneB = Further(10, 80, "1Б", "Москва", 4, 14, 23 )
    println("Введите цену билета")
    var price1 = readln()!!.toDouble()
    OneB.SetPrice(price1)
    println("Введите скорость поезда")
    OneB.Speed(readln()!!.toDouble())
    OneB.Info() //вывод информации про прибытие, стоянку и время в пути
    OneB.path() //вывод информации о поезде
    var L4 = Suburb(10, 10, "Л-4", "Красноуфимск", 0, 16, 9 )
    println("Введите цену билета")
    var price2 = readln()!!.toDouble()
    L4.SetPrice(price2)
    println("Введите скорость поезда")
    L4.Speed(readln()!!.toDouble())
    L4.Info()
    L4.path()
    var T10 = NewTrain("T-10", "Ростов", 3, 23, 9)
    println("Введите скорость поезда")
    T10.Info()
    T10.path()
}
