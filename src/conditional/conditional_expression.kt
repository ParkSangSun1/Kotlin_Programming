package conditional

fun main(){
    var healthPoints = 100

    val healthStatus = if (healthPoints==100){
        "최상의 상태임!"
    }else if (healthPoints>=90){
        "약간의 찰과상만 있음"
    }else{
        "최악의 상태임!"
    }
}