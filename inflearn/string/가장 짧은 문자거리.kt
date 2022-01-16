package inflearn.string

import java.util.Scanner

private fun solution(word:String, search:Char):Array<Int> = Array(word.length){0}.also {
    var temp = 101
    word.forEachIndexed { idx, str ->
        if(str==search) temp = 0 else temp++
        it[idx] = temp
    }
    temp = 101
    word.reversed().forEachIndexed { idx, str ->
        val index = word.length - 1 - idx
        if(str==search) temp = 0 else temp ++
        it[index] = it[index].coerceAtMost(temp)
    }
}

private fun main() {
    val sc = Scanner(System.`in`)
    val result = solution(sc.next(), sc.next()[0])
    println(result.joinToString(" "))
}
