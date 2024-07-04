package cl.ravenhill.employee

/**
 * Interface representing an employee with a base salary and an extra coefficient for calculating salary.
 *
 * ## Usage:
 * This interface defines the contract for employee types, requiring implementations to provide a base salary, an extra
 * coefficient, and a method to calculate the salary based on extra hours worked.
 *
 * ### Example 1: Implementing the Employee Interface
 * ```
 * class Developer(override val baseSalary: Int, override val extraCoefficient: Int) : Employee {
 *     override fun calculateSalary(extraHours: Int): Int {
 *         return baseSalary + (extraCoefficient * extraHours)
 *     }
 * }
 *
 * val developer = Developer(baseSalary = 50000, extraCoefficient = 200)
 * val totalSalary = developer.calculateSalary(extraHours = 10)
 * println(totalSalary) // Output: 52000
 * ```
 * @property baseSalary The base salary of the employee.
 * @property extraCoefficient The coefficient used to calculate the extra salary based on extra hours worked.
 */
interface Employee {
    val baseSalary: Int
    val extraCoefficient: Int

    /**
     * Calculates the total salary based on the base salary and the extra hours worked.
     *
     * @param extraHours The number of extra hours worked.
     * @return The total salary including extra hours.
     */
    fun calculateSalary(extraHours: Int): Int
}
