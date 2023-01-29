fun main()
{
    fun reboot(sec: Int): Triple<Int, Int, Int>
    {
        return Triple(sec/60/60%24, sec/60%60,sec%60)
    }
    println("Введите количество секунд: ")
    var Columnsseconds: Int = readln().toInt()
    var (Hour, Min, Sec) = reboot(Columnsseconds)
    println("$Columnsseconds секунд = $Hour час( ов, a) $Min минут(ы, a) $Sec секунд(а, ы)")
}