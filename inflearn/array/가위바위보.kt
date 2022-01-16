package inflearn.array

import java.util.Scanner

// 1: 가위, 2: 바위, 3: 보

private fun solution(n:Int, a:Array<Int>, b:Array<Int>):String = (0 until n).fold(""){ acc, i ->
    "$acc${
        when{
            a[i] == b[i] -> "D"
            a[i] == 1 && b[i] == 3 -> "A"
            a[i] == 2 && b[i] == 1 -> "A"
            a[i] == 3 && b[i] == 2 -> "A"
            else -> "B"
        }
    }"
}
private fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = Array(n){0}
    val b = Array(n){0}
    for(i in a.indices) a[i] = sc.nextInt()
    for(i in b.indices) b[i] = sc.nextInt()
    println(solution(n, a, b))
}
