import java.util.*

fun main(args: Array<String>) {

    /*Массивы:*/

/*1. Дан массив с целыми числами. Вывести в консоль количество положительных и отрицательных чисел в нем*/
/*
    val a = intArrayOf(8, 2, 7, -2, 5, 6, 3, 1, 9, -3, -6, -8, -1, -4, -5, -7, -9)
    println("Массив целых чисел:\n")
    println(Arrays.toString(a))
    var countNegative = 0
    var countPositive = 0
    for (value in a) {
        if (value < 0) {
            countNegative++
        } else if (value > 0) {
            countPositive++
        } else {
            break
        }
    }
    println("\nОтрицательные числа:$countNegative")
    println("\nПоложительные числа:$countPositive")


/*2. Дан массив с целыми числами. Вывести в консоль сумму элементов с четными индексами*/

    val numbersArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val oddArray = numbersArray.filter{ it % 2 != 0 }.toTypedArray()
    print(Arrays.toString(oddArray))
    print("\nСумма элементов с четными индексами:")
    print(oddArray.sum())

/*3. Дан массив с целыми числами. Вывести в консоль сумму четных элементов (четные значения)*/

    var arr = arrayOf(12, 42, 63, 56, 122, 17, 117, 25, 645, 722, 964)
    var i = 0
    for (i in 0..10)
    {
        if ((arr[i] % 2) == 0)
        {
            println(arr[i]);
        }
    }

/*4. Дан массив с целыми числами. Вывести в консоль наибольшее из них*/

    val numbers: IntArray = intArrayOf(4, 9, 3, 2, 6)
    var largestElement = numbers[0]

    for (number in numbers){
        if(largestElement < number)
            largestElement = number
    }
    println("Наибольшее число в массиве: $largestElement")

 */
/*5. Дан массив с целыми числами. Вывести в консоль наиболее часто встречающееся числа. Если таких несколько, то вывести
    наибольшее из них, если повторяющихся нет, вывести соответствующее сообщение.*/


/*6. Дан двумерный массив 10х10 с целыми числами. Вывести в консоль все числа по диагонали от [0][0] до [10][10]*/
/*
    var arr_1 = arrayOf(intArrayOf(10, 21, -3), intArrayOf(14, 0, 6), intArrayOf(-110, 8, 1000))
    for (row in arr_1) {
        println(row.contentToString())
    }
    println(arr_1[0][0])
    println(arr_1[1][1])
    println(arr_1[2][2])

/*7. Дан двумерный массив 10х10 с целыми числами. Вывести в консоль все числа по диагонали от [0][10] до [10][0]*/

    var arr_2 = arrayOf(intArrayOf(10, 21, -3), intArrayOf(14, 0, 6), intArrayOf(-110, 8, 1000))
    for (row in arr_2) {
        println(row.contentToString())
    }
    println(arr_2[0][2])
    println(arr_2[1][1])
    println(arr_2[2][0])

/*8. Дан двумерный массив 5х5 с целыми числами. Посчитать суммы чисел в каждом столбце и вывести наибольшую из них*/

    var arr_3 = arrayOf(intArrayOf(10, 21, -3), intArrayOf(14, 0, 6), intArrayOf(-110, 8, 1000))
    val array_1 = arr_3 [0][0]
    val array_2 = arr_3 [0][1]
    val array_3 = arr_3 [0][2]
    val array_4 = arr_3 [1][0]
    val array_5 = arr_3 [1][1]
    val array_6 = arr_3 [1][2]
    val array_7 = arr_3 [2][0]
    val array_8 = arr_3 [2][1]
    val array_9 = arr_3 [2][2]
    var pillar_1 = array_1 + array_4 + array_7
    var pillar_2 = array_2 + array_5 + array_8
    var pillar_3 = array_3 + array_6 + array_9
    if (pillar_1>pillar_2 && pillar_1>pillar_3) {
        println("Сумма чисел в первой строке самая наибольшая и равна: $pillar_1")
    } else if (pillar_2>pillar_1 && pillar_2>pillar_3) {
        println("Сумма чисел во второй строке самая наибольшая и равна: $pillar_2")
    } else {
        println("Сумма чисел в третьей строке самая наибольшая и равна: $pillar_3")
    }
 */
}