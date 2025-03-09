class Vegetable(var fresh: Int, empName: String, empPrice: Double, empEd: String, empType: String, empCount: Int) : Products(empName, empPrice, empEd, empType, empCount) {
    private var calorie: Int = 1
    fun SetFresh(fresh: Int){
        if (fresh < 0){
            println("Процент уходит за 0")
        }
        else if(fresh > 100){
            println("Процент уходит за 100")
        }
        else{
            this.fresh = fresh
        }
    }
    fun SetCal(calorie: Int){
        if (calorie <= 0){
            println("Калорий не может быть меньше 1")
        }
        else{
            this.calorie = calorie
        }
    }
    override fun Info() {
        if (count > 0){
            println("Овощь - ${name}")
            println("Свежесть ${fresh}%, количество калорий: ${calorie}")
            println("вид - ${type}, количество: ${count}")
        }
        else {
            println("Количество не может быть меньше 0")
        }
    }
    override fun Weight() {
        if (price > 1) {
            println("${price} за 1 ${ed}")
        } else {
            println("Цена должна быть больше 1")
        }
    }
    override fun Sum(){
        if (count > 0 && price > 1){
            println("Итого за ${count} ед надо заплатить ${String.format("%.2f",price*(count/2))} руб")
        }
    }
}
