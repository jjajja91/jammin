package inflearn.string

import java.util.Scanner

private fun solution(word:String):String = if(word.lowercase() == word.lowercase().reversed()) "YES" else "NO"
private fun main() {
    val sc = Scanner(System.`in`)
    println(solution(sc.next()))
}
