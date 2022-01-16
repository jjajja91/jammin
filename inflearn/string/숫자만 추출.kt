package inflearn.string

import java.util.Scanner

private fun solution(word:String):Int = word.uppercase().replace("""[A-Z]""".toRegex(), "").toInt()

private fun main() {
    val sc = Scanner(System.`in`)
    println(solution(sc.next()))
}
