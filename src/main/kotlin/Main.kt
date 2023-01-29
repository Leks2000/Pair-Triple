//Создать приложение, которое подсчитывает количество подряд идущих одинаковых символов во введенной строке.
// На вход подается, например, строка AAADSSSRRTTHAAAA. На выходе получаем A3DS3R2T2HA4.
// То есть, если количество подряд идущих символов меньше двух, то мы не пишем единицу
fun main()
{
    println("Введите только символы: ")
    var Input: String = readLine().toString()
    var i = Input[0]
    var count = 0
    print("Результат: ")
    for (x in Input){
        if(x == i)
        {
            count++
        }
        else if(count < 2)
        {
            print("$i")
            i = x
            count = 1
        }
        else {
            print("$i$count")
            i = x
            count = 1
        }
    }
    print("$i$count")
}