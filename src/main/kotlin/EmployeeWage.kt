fun main(args: Array<String>) {

    val WAGE_PER_HOUR: Int = 20
    val NO_OF_DAYS: Int = 20

    println("Enter 1 -> Full Time Employee \nEnter 2 -> Part Time Employee")
    val num = readLine()!!
    when (num.toInt()){
           1 -> FullTimeEmployee(WAGE_PER_HOUR,8, NO_OF_DAYS)
           2 -> PartTimeEmployee(WAGE_PER_HOUR,4, NO_OF_DAYS)
    }

}
class FullTimeEmployee() {

    constructor(WAGE_PER_HOUR: Int, FULL_DAY_HOUR: Int, NO_OF_DAYS: Int) : this() {
        val isPresent: Int = 1
        val isAbsent: Int = 0
        println("\nFull Time Employee Wage \n\nThe daily wage of employee is ${calculateDailyWage(WAGE_PER_HOUR, FULL_DAY_HOUR)}")
        displayPresentOrAbsentWithDailyWage(isAbsent, isPresent ,WAGE_PER_HOUR, NO_OF_DAYS)
    }

    private fun checkPresentOrAbsent(isAbsent: Int, isPresent: Int): Int {
            return (isAbsent..isPresent).random()
    }

    private fun displayPresentOrAbsentWithDailyWage(isAbsent: Int, isPresent: Int, WAGE_PER_HOUR: Int, NO_OF_DAYS: Int) {
        var days: Int = 1
        var monthlyWage: Int = 0
        while (days <= NO_OF_DAYS) {
            println("Day $days:")
            if (checkPresentOrAbsent(isAbsent, isPresent) == 0) {
                val fullDayHour: Int = 0
                println("\nFull Time Employee Is Absent")
                var dailyWage = calculateDailyWage(WAGE_PER_HOUR, fullDayHour)
                monthlyWage += dailyWage
                println("Today employee's wage is $dailyWage")
            } else {
                val fullDayHour: Int = 8
                println("\nFull Time Employee Is Present")
                var dailywage = calculateDailyWage(WAGE_PER_HOUR, fullDayHour)
                monthlyWage += dailywage
                println("Today employee's wage is $dailywage")
            }
            days += 1;
        }
        println("The Total wage of Employee for a month is $monthlyWage")
    }

    private fun calculateDailyWage(wagePerHour: Int, fullDayHour: Int): Int {
            val dailyWage = wagePerHour * fullDayHour
            return (dailyWage)
    }
}


class PartTimeEmployee(WAGE_PER_HOUR: Int, FULL_DAY_HOUR: Int, NO_OF_DAYS: Int) {

    init {
        val isPresent: Int = 1
        val isAbsent: Int = 0
        println("\nPart Time Employee Wage \n\nThe daily wage of employee is ${calculateDailyWage(WAGE_PER_HOUR, FULL_DAY_HOUR)}")
        calculateMontlyWage(isAbsent, isPresent, WAGE_PER_HOUR, NO_OF_DAYS)
    }

    private fun checkPresentOrAbsent(isAbsent: Int, isPresent: Int): Int {
        return (isAbsent..isPresent).random()
    }

    private fun calculateMontlyWage(isAbsent: Int, isPresent: Int, WAGE_PER_HOUR: Int, NO_OF_DAYS: Int) {
        var days: Int = 1
        var monthlyWage: Int = 0
        while (days <= NO_OF_DAYS) {
            println("\nDay $days:")
            if (checkPresentOrAbsent(isAbsent, isPresent) == 0) {
                val fullDayHour: Int = 0
                println("\nPart Time Employee Is Absent")
                var dailyWage = calculateDailyWage(WAGE_PER_HOUR, fullDayHour)
                monthlyWage += dailyWage
                println("Today employee's wage is $dailyWage")
            } else {
                val fullDayHour: Int = 4
                println("\nPart Time Employee Is Present")
                var dailywage = calculateDailyWage(WAGE_PER_HOUR, fullDayHour)
                monthlyWage += dailywage
                println("Today employee's wage is $dailywage")
            }
            days += 1;
        }
        println("\nThe Total wage of Employee for a month is $monthlyWage")
    }

    private fun calculateDailyWage(wagePerHour: Int, fullDayHour: Int): Int {
        val dailyWage = wagePerHour * fullDayHour
        return (dailyWage)
    }
}