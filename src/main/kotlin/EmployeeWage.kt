fun main(args: Array<String>) {

    val WAGE_PER_HOUR: Int = 20

    println("Enter 1 -> Full Time Employee \nEnter 2 -> Part Time Employee")
    val num = readLine()!!
    when (num.toInt()){
           1 -> FullTimeEmployee(WAGE_PER_HOUR,8)
           2 -> PartTimeEmployee(WAGE_PER_HOUR,4)
    }

}
class FullTimeEmployee() {

    constructor(WAGE_PER_HOUR: Int, FULL_DAY_HOUR: Int) : this() {
        val isPresent: Int = 1
        val isAbsent: Int = 0
        println("\nFull Time Employee Wage \n\nThe daily wage of employee is ${calculateDailyWage(WAGE_PER_HOUR, FULL_DAY_HOUR)}")
        displayPresentOrAbsentWithDailyWage(isAbsent, isPresent ,WAGE_PER_HOUR)
    }

    private fun checkPresentOrAbsent(isAbsent: Int, isPresent: Int): Int {
            return (isAbsent..isPresent).random()
    }

    private fun displayPresentOrAbsentWithDailyWage(isAbsent: Int, isPresent: Int, WAGE_PER_HOUR: Int) {
        if (checkPresentOrAbsent(isAbsent, isPresent) == 0) {
                val fullDayHour: Int = 0
                println("\nFull Time Employee Is Absent")
                println("Today employee's wage is ${calculateDailyWage(WAGE_PER_HOUR, fullDayHour)}")
        } else {
                val fullDayHour: Int = 8
                println("\nFull Time Employee Is Present")
                println("Today employee's wage is ${calculateDailyWage(WAGE_PER_HOUR, fullDayHour)}")
        }
    }

    private fun calculateDailyWage(wagePerHour: Int, fullDayHour: Int): Int {
            val dailyWage = wagePerHour * fullDayHour
            return (dailyWage)
    }
}


class PartTimeEmployee(WAGE_PER_HOUR: Int, FULL_DAY_HOUR: Int) {

    init {
        val isPresent: Int = 1
        val isAbsent: Int = 0
        println("\nPart Time Employee Wage \n\nThe daily wage of employee is ${calculateDailyWage(WAGE_PER_HOUR, FULL_DAY_HOUR)}")
        displayPresentOrAbsentWithDailyWage(isAbsent, isPresent, WAGE_PER_HOUR)
    }

    private fun checkPresentOrAbsent(isAbsent: Int, isPresent: Int): Int {
        return (isAbsent..isPresent).random()
    }

    private fun displayPresentOrAbsentWithDailyWage(isAbsent: Int, isPresent: Int, WAGE_PER_HOUR: Int) {
        if (checkPresentOrAbsent(isAbsent, isPresent) == 0) {
            val fullDayHour: Int = 0
            println("\nPart Time Employee Is Absent")
            println("Today employee's wage is ${calculateDailyWage(WAGE_PER_HOUR, fullDayHour)}")
        } else {
            val fullDayHour: Int = 4
            println("\nPart Time Employee Is Present")
            println("Today employee's wage is ${calculateDailyWage(WAGE_PER_HOUR, fullDayHour)}")
        }
    }

    private fun calculateDailyWage(wagePerHour: Int, fullDayHour: Int): Int {
        val dailyWage = wagePerHour * fullDayHour
        return (dailyWage)
    }
}