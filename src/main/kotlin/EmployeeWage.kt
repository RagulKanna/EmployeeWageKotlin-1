fun main(args: Array<String>) {
    val isPresent = 1
    val isAbsent = 0
    if(rand(isAbsent, isPresent) == 0){
        println("The Employee Is Absent")
    }
    else{
        println("The Employee Is Present")
    }
}

fun rand(isAbsent: Int, isPresent: Int): Int {
    return (isAbsent..isPresent).random()
}