fun main() {

    println(trans("Maestro",0,133000))
}

fun trans(cardName: String = "VK pay", lastTransfer: Int = 0, amount: Int) = when (cardName) {
    "Mastercard", "Maestro" -> when {
        lastTransfer > 150_000 || lastTransfer + amount > 600_000 -> println("Превышен лимит перевода")
        lastTransfer in 300..75000 -> 0
        else -> (amount * 0.006).toInt() + 20
    }
    "Visa", "Мир" -> when {
        lastTransfer > 150_000 || lastTransfer + amount > 600_000 -> println("Превышен лимит перевода")
        else -> peace(amount)
    }
    "VK pay" -> when {
        lastTransfer > 15_000 || lastTransfer + amount > 40_000 -> println("Превышен лимит перевода")
        else -> 0
    }
    else -> println("Таким способом перевод невозможен")
}

fun peace(amount: Int): Double {
    var tax = amount * 0.0075
    if (tax <= 35) return 35.0 else return tax
}
