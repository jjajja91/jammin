package inflearn.array

import java.util.Scanner

private fun solution(n:Int):MutableList<Int> = mutableListOf(1, 1).also {
    for(i in 2 until n) it += it[i-2]+it[i-1]
}
private fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(solution(n).joinToString(" "))
}
