package inflearn.string

import java.util.Scanner

private fun solution(word:String):String = word.split(" ").fold("") {acc, c -> if(acc.length < c.length) c else acc }
private fun main() {
    val sc = Scanner(System.`in`)
    println(solution(sc.nextLine()))
}
