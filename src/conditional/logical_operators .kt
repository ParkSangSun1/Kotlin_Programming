package conditional

fun main(){
    val name = "마드리갈"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false

    //아우라
    //isBlessed가 true고 healthPoints가 51 이상이거나 isImmortal이 true일 경우 = GREEN
    if (isBlessed && healthPoints > 50 || isImmortal)
        println("GREEN")
    else
        println("NONE")

}