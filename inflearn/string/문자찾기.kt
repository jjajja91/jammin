package inflearn.string

import java.util.Scanner

private fun solution(word:String, search:Char) = word.fold(0) {acc, curr -> if(curr == search) acc+1 else acc}
private fun main() {
    val sc = Scanner(System.`in`)
    println(solution(sc.next().uppercase(), sc.next().uppercase()[0]))
}
