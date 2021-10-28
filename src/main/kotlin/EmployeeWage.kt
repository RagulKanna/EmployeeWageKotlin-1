fun main(args: Array<String>) {

    val wagePerHour: Int = 20
    val noOfDays: Int = 20

    println("Enter 1 -> Full Time Employee \nEnter 2 -> Part Time Employee")
    val num = readLine()!!
    when (num.toInt()){
           1 -> FullTimeEmployee(wagePerHour,8, noOfDays)
           2 -> PartTimeEmployee(wagePerHour,4, noOfDays)
    }
}

class Employee{
    
    private fun checkingEmployeePresentOrAbsent(isAbsent: Int, isPresent: Int): Int {
        return (isAbsent..isPresent).random()
    }

    fun calculatingMonthlyWage(isAbsent: Int, isPresent: Int, WAGE_PER_HOUR: Int, NO_OF_DAYS: Int, totalHours: Int, FULL_DAY_HOUR: Int) {
        var days: Int = 1
        var monthlyWage: Int = 0
        var hours: Int = 0
        var totalWorkedHours: Int = 0
        while (days <= NO_OF_DAYS && hours <= totalHours) {
            if(hours + FULL_DAY_HOUR < totalHours) {
                println("\nDay $days:")
                if (checkingEmployeePresentOrAbsent(isAbsent, isPresent) == 0) {
                    println("\nEmployee Is Present")
                    val dailyWage = calculatingDailyWage(WAGE_PER_HOUR, FULL_DAY_HOUR)
                    monthlyWage += dailyWage
                    hours += FULL_DAY_HOUR
                    totalWorkedHours = hours
                    println("Today employee's wage is $dailyWage")
                } else {
                    println("\nEmployee Is Absent")
                    println("Today employee's wage is 0")
                }
            }else{
                hours = totalHours + 1
            }
            days += 1;
        }
        println("\nThe Total wage of Employee for a month is $monthlyWage and total worked hours is $totalWorkedHours")
    }

    fun calculatingDailyWage(wagePerHour: Int, fullDayHour: Int): Int {
        val dailyWage = wagePerHour * fullDayHour
        return (dailyWage)
    }
}

class FullTimeEmployee(WAGE_PER_HOUR: Int, FULL_DAY_HOUR: Int, NO_OF_DAYS: Int){
private var employee = Employee()
    init {
        val isPresent: Int = 1
        val isAbsent: Int = 0
        val totalHours = 100

        println(
            "\nFull Time Employee Wage \n\nThe daily wage of employee is ${
                employee.calculatingDailyWage(
                    WAGE_PER_HOUR,
                    FULL_DAY_HOUR
                )
            }"
        )
        employee.calculatingMonthlyWage(isAbsent, isPresent, WAGE_PER_HOUR, NO_OF_DAYS, totalHours, FULL_DAY_HOUR)
    }

}


class PartTimeEmployee(WAGE_PER_HOUR: Int, FULL_DAY_HOUR: Int, NO_OF_DAYS: Int) {

    private var employee = Employee()

    init {
        val isPresent: Int = 1
        val isAbsent: Int = 0
        val totalHours = 50

        println("\nPart Time Employee Wage \n\nThe daily wage of employee is ${employee.calculatingDailyWage(WAGE_PER_HOUR, FULL_DAY_HOUR)}")
        employee.calculatingMonthlyWage(isAbsent, isPresent, WAGE_PER_HOUR, NO_OF_DAYS, totalHours, FULL_DAY_HOUR)
    }
}