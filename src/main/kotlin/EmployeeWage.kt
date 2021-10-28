fun main(args: Array<String>) {
    val employee = Employee();
    val isPresent: Int = 1
    val isAbsent: Int = 0
    val WAGE_PER_HOUR: Int = 20
    val FULL_DAY_HOUR: Int = 8

    println("The daily wage of the employee is ${employee.calculateDailyWage(WAGE_PER_HOUR, FULL_DAY_HOUR)}" )
    employee.displayPresentOrAbsentWithDailyWage(isAbsent, isPresent, WAGE_PER_HOUR)

}
class Employee {
    private fun checkPresentOrAbsent(isAbsent: Int, isPresent: Int): Int {
        return (isAbsent..isPresent).random()
    }
    fun displayPresentOrAbsentWithDailyWage(isAbsent: Int, isPresent: Int, WAGE_PER_HOUR: Int) {
        if(checkPresentOrAbsent(isAbsent, isPresent) == 0){
            val FULL_DAY_HOUR: Int = 0
            println("\nThe Employee Is Absent")
            println("Today employee's wage is ${calculateDailyWage(WAGE_PER_HOUR, FULL_DAY_HOUR)}" )
        }
        else{
            val FULL_DAY_HOUR: Int = 8
            println("\nThe Employee Is Present")
            println("Today employee's wage is ${calculateDailyWage(WAGE_PER_HOUR, FULL_DAY_HOUR)}" )
        }
    }

    fun calculateDailyWage(wagePerHour: Int, fullDayHour: Int): Int {
        val dailyWage = wagePerHour * fullDayHour
        return (dailyWage)
    }
}


