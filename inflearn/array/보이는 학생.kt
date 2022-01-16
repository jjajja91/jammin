package inflearn.array

import java.util.Scanner

private fun solution(arr:Array<Int>):Int = arr.fold(0 to 0) { acc, i -> if(i>acc.first) i to acc.second+1 else acc }.second

private fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val arr = Array(n){0}
    for(i in arr.indices) arr[i] = sc.nextInt()
    println(solution(arr))
}
