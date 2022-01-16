package inflearn.string

import java.util.Scanner

private fun solution(word:String):String = word.fold(""){acc, c -> "$acc${if(c.isLowerCase()) c.uppercase() else c.lowercase() }" }
private fun main() {
    val sc = Scanner(System.`in`)
    println(solution(sc.next()))
}
