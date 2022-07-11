package module

fun main() {
    val str = "F2p)v\"y233{0->c}ttelciFc"

    val strLeft = getStringHalf(true, str)

    val shiftedString1 = strLeft.map { it + 1 }.joinToString("")

    val replaced1 = shiftedString1.replace(oldChar = '5', newChar = 's')

    val replaced2 = replaced1.replace(oldChar = '4', newChar = 'u')

    val shiftedString2 = replaced2.map { it - 3 }.joinToString("")

    val replaced3 = shiftedString2.replace(oldChar = '0', newChar = 'o')

    val strRight = getStringHalf(false, str)

    val reverse = strRight.reversed()

    val shiftedString = reverse.map { it - 4 }.joinToString("")

    val replaced = shiftedString.replace(oldChar = '_', newChar = ' ')

    println(replaced3 + replaced)

}

fun getStringHalf(isFirst: Boolean, str: String): String {
    if (isFirst == true) {
        return str.take(str.length / 2)
    } else {
        return str.drop(str.length / 2)
    }

}