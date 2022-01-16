package inflearn.array

import java.util.Scanner

private fun solution(n:Int):Int = Array(n+1){-1}.also {
    it[0] = 0
    it[1] = 1
    for (i in 2..n){
        var j = 2
        while(i * j <= n) {
            it[i*j++] = 1
        }
    }
}.filter { it == -1 }.size
private fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(solution(n))
}
