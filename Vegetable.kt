import Product.*
class Vegetable(var fresh: Int, empName: String, empPrice: Double, empEd: String, empType: String, empCount: Int) : Products(empName, empPrice, empEd, empType, empCount) {
    private var calorie: Int = 1
    public fun SetFresh(fresh: Int){
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
    public fun SetCal(calorie: Int){
        if (calorie <= 0){
            println("Калорий не может быть меньше 1")
        }
        else{
            this.calorie = calorie
        }
    }

    override fun Info() {
        println("Овощь - ${name}")
        println("Свежесть ${fresh}%, количество калорий: ${calorie}")
        println("вид - ${type}, количество: ${count}")
    }

    override fun Weight() {
        println("${price} за 1 ${ed}")
    }
}