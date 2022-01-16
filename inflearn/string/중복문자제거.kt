package inflearn.string

import java.util.Scanner

private fun solution(word:String):String = word.foldIndexed(""){idx, acc, curr -> if(word.indexOf(curr)==idx) "$acc$curr" else acc }
private fun main() {
    val sc = Scanner(System.`in`)
    println(solution(sc.next()))
}
