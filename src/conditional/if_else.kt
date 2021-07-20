package conditional

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println

//플레이어의 건강 상태를 출력하기
fun main(args: Array<String>) {
    val name = "마들리갈"
    var healthPoints = 100

    if (healthPoints == 100) {
        println(name + "최상의 상태임!")
    } else {
        println(name + "최악의 상태임!")
    }
}
