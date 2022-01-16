package inflearn.string

import java.util.Scanner

private fun solution(word:String):String = word.uppercase().replace("""[^A-Z]""".toRegex(), "").let{ if(it == it.reversed()) "YES" else "NO" }

private fun main() {
    val sc = Scanner(System.`in`)
    println(solution(sc.nextLine()))
}
