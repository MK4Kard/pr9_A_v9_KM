package Product
open class Products(var name: String, var price: Double, var ed: String, var type: String, var count: Int) {
    open fun SetPrice(price: Double){
        if (price <= 0){
            println("Товар не может стоить меньше рубля")
        }
        else {
            this.price = price
        }
    }

    open fun SetCount(count: Int){
        if (count < 0){
            println("Количество не может быть меньше 0")
        }
        else{
            this.count = count
        }
    }

    open fun Weight() {
        println("${price} за 1 единицу")
    }

    open fun Info() {
        println("Товар ${name}")
        println("вид - ${type}, количество: ${count}")
    }
}