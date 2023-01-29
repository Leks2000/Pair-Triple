//Создать функцию, которая принимает в качестве параметров два положительных целых числа и возвращает НОК (наименьшее общее кратное)
// и НОД (наибольший общий делитель)
fun main()
{
    println("Введите два положительных числа через пробел: ")
    var str = readLine().toString().split(" ")

    var (a,b) = Pair(str[0].toInt(),str[1].toInt())
    if (a > 0 && b > 0) {
        var NOD = NOD(a, b)
        println("НОД: $NOD")
        var NOK = NOK(a, b)
        println("НОK: $NOK")
    }
    else
    {
        println("Введите только положительные числа")
    }
}
fun NOD(x: Int, y: Int): Int{
    return if (y == 0) x else NOD(y, x % y)
}
fun NOK(x: Int, y: Int): Int{
    return x * y / NOD(x,y)
}