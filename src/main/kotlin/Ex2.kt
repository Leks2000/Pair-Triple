//Создать приложение, которое подсчитывает количество различных символов во введенной строке.
// Символы в ответе расположить в алфавитном порядке. Например, дана строка AASADDSS.
// На выходе получаем:
//A - 3
//D - 2
//S - 3
fun main()
{
    println("Введите данные: ")
    var Input: String = readLine().toString()
    var alpha = Input.toCharArray()
    alpha.sort()
    var i = Input[0]
    var count = 0
    for (x in alpha)
    {
        if (x == i)
        {
            count++
        }
        else
        {
            println("$i - $count")
            i = x
            count = 1
        }
    }
    println("$i - $count")
}