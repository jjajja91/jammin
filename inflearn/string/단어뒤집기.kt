package inflearn.string

import java.util.Scanner

private fun solution(words:List<String>):List<String> = mutableListOf<String>().also{ words.forEach { word -> it += word.fold("") {acc, c -> "$c$acc" } } }
private fun main() {
    val sc = Scanner(System.`in`)
    val time = sc.nextInt()
    val inputs = mutableListOf<String>()
    for(i in 0 until time) { inputs += sc.next() }
    solution(inputs).forEach { println(it) }
}
