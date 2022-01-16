package inflearn.string

import java.util.Scanner

private fun solution(word:String):String {
    var res = ""
    var cnt = 1
    word.forEachIndexed { idx, str ->
        var isOk = true
        try{ word[idx+1] } catch (e:IndexOutOfBoundsException) { isOk = false }
        if(isOk && str == word[idx+1]) cnt ++
        else {
            res = if(cnt == 1) "$res$str" else "$res$str$cnt"
            cnt = 1
        }
    }
    return res
}
private fun main() {
    val sc = Scanner(System.`in`)
    println(solution(sc.next()))
}
