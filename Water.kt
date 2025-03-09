class Water(var litr: Double, var bubble: String, empName: String, empPrice: Double, empEd: String, empType: String, empCount: Int) : Products(empName, empPrice, empEd, empType, empCount) {
    private var calorie: Int = 0
    fun SetLitr(litr: Double){
        if (litr <= 0){
            println("Литр не может быть меньше или равен 0")
        }
        else {
            this.litr = litr
        }
    }
    fun SetBubb(bubble: String){
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
        if (count > 0){
            println("Вода - ${name}, ${litr} л")
            println("${bubble}, количество калорий: ${calorie}")
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
            println("Итого за ${count} ед надо заплатить ${String.format("%.2f",price*litr*count)} руб")
        }
    }
}
