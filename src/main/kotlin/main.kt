fun main() {
    val tax = trans("Visa", amount = 1200)
    println("Скидка $tax")

}
fun trans(cardName : String = "VK pay", lastTransfer : Int = 0, amount : Int) = when (cardName) {
    "Mastercard", "Maestro" -> if (amount > 75_000) amount / 100 * 0.6 + 20 else 0.0
    "Visa", "Мир" -> peace(amount)
    else -> 0.0
}

fun peace (amount: Int) : Double{
    var tax = amount / 100 * 0.75
    if(tax <= 35) return 35.0 else return tax
}
