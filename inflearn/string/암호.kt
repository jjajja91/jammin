package inflearn.string

import java.util.Scanner

private fun solution(cnt:Int, word:String):String {
    var res = ""
    var s = word
    for(i in 0 until cnt) {
        val tmp = s.substring(0, 7).replace("#", "1").replace("*", "0")
        val num = Integer.parseInt(tmp, 2)
        res = "$res${num.toChar()}"
        s = s.substring(7)
    }
    return res
}
private fun main() {
    val sc = Scanner(System.`in`)
    println(solution(sc.nextInt(), sc.next()))
}
