open class Products(var name: String, var price: Double, var ed: String, var type: String, var count: Int) {
    open fun Weight() {
        if (price > 1){
            println("${price} за 1 единицу")
        }
        else{
            println("Цена должна быть больше 1")
        }
    }
    open fun Info() {
        if (count > 0){
            println("Товар ${name}")
            println("вид - ${type}, количество: ${count}")
        }
        else {
            println("Количество не может быть меньше 0")
        }
    }
    open fun ExpDate(exp: Int, term: String) {
        if (exp > 0){
            println("Срок годности: ${exp} ${term}")
        }
    }
    open fun Sum(){
        if (count > 0 && price > 1){
            println("Итого за ${count} ед надо заплатить ${String.format("%.2f",price*count)} руб")
        }
    }
}
