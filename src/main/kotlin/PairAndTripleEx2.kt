//Создать функцию, которая принимает в качестве параметров координаты двух точек на плоскости и вычисляет расстояние между этими точками.
// Функция имеет всего два параметра.
import kotlin.math.pow
fun main()
{
    println("Введите координаты точки A x и y")
    var Ax = readln().toDouble()
    var Ay = readln().toDouble()
    println("Введите координаты второй точки B x и y")
    var Bx = readln().toDouble()
    var By = readln().toDouble()
    var result = Math.sqrt((Bx-Ax).pow(2) + (By-Ay).pow(2))
    println("Расстояние между точкой A и точкой B: $result")
}