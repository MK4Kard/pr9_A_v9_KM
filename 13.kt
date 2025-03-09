fun main() {
    try {
        var potato = Vegetable(100, "картофель", -10.0, "кг", "красный картофель", 0)
        println("Введите количество калорий")
        var cal = readln()!!.toInt()
        println("Введите количество срока годности")
        var exp = readln()!!.toInt()
        println("Введите промежуток срока годности")
        var date = readln()
        potato.SetCal(cal)
        potato.SetFresh(potato.fresh)
        potato.Info()
        potato.Weight()
        potato.Sum()
        potato.ExpDate(exp, date)

        println("Введите сколько литров")
        var l = readln()!!.toDouble()
        var wtr = Water(l, "Да", "Пряность", 75.9, "л", "сладкая вода", 2)
        println("Введите количество срока годности")
        exp = readln()!!.toInt()
        println("Введите промежуток срока годности")
        date = readln()
        wtr.SetLitr(wtr.litr)
        wtr.SetBubb(wtr.bubble)
        wtr.Info()
        wtr.Weight()
        wtr.Sum()
        wtr.ExpDate(exp, date)
    }
    catch(e:Exception){
        println("неверный ввод")
    }
}
