package inflearn.array

import java.util.Scanner

private fun solution(arr:Array<Int>):MutableList<Int> = mutableListOf(arr[0]).also {
    for(i in 1 until arr.size) if(arr[i]>arr[i-1]) it += arr[i]
}

private fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val arr = Array(n){0}
    for(i in arr.indices) arr[i] = sc.nextInt()
    println(solution(arr).joinToString(" "))
}
