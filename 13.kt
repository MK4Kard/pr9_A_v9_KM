fun main() {
    var potato = Vegetable(100, "картофель", 45.5, "кг", "красный картофель", 15 )
    println("Введите количество калорий")
    var cal = readln()!!.toInt()
    potato.SetCal(cal)
    potato.SetFresh(potato.fresh)
    potato.Info()
    potato.Weight()

    println("Введите сколько литров")
    var l = readln()!!.toDouble()
    var wtr = Water(l, "Нет", "Пряность", 75.9, "л", "сладкая вода", 2)
    wtr.SetLitr(wtr.litr)
    wtr.SetBubb(wtr.bubble)
    wtr.Info()
    wtr.Weight()
}