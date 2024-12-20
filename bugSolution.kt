fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers)

    //This is the corrected line. Providing an initial value of 0
    val sum = list.reduce { sum, element -> sum + element }
    println(sum)

    val emptyList = emptyList<Int>()
    val sumOfEmptyList = emptyList.reduceOrNull { sum, element -> sum + element } ?: 0
    println(sumOfEmptyList)
}