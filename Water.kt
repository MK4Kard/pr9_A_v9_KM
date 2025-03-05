import Product.*
class Water(var litr: Double, var bubble: String, empName: String, empPrice: Double, empEd: String, empType: String, empCount: Int) : Products(empName, empPrice, empEd, empType, empCount) {
    private var calorie: Int = 0
    public fun SetLitr(litr: Double){
        if (litr <= 0){
            println("Литр не может быть меньше или равен 0")
        }
        else {
            this.litr = litr
        }
    }

    public fun SetBubb(bubble: String){
        if (bubble == "Да"){
            this.bubble = "Газированная"
        }
        else if (bubble == "Нет"){
            this.bubble = "Не газированная"
        }
        else {
            this.bubble = "Не выбрано"
        }
    }

    override fun Info() {
        println("Вода - ${name}, ${litr} л")
        println("${bubble}, количество калорий: ${calorie}")
        println("вид - ${type}, количество: ${count}")
    }

    override fun Weight() {
        println("${price} за 1 ${ed}")
    }
}