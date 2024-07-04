package cl.ravenhill.employee

/**
 * Interface representing an employee capable of earning overtime.
 *
 * ## Usage:
 * This interface extends the [Employee] interface and adds an extra coefficient for calculating overtime pay. It
 * requires implementations to provide a method for calculating the total salary based on extra hours worked.
 *
 * ### Example 1: Implementing the OvertimeCapable Interface
 * ```
 * class Developer(
 *     override val baseSalary: Int,
 *     override val extraCoefficient: Int
 * ) : OvertimeCapable {
 *     override fun calculateSalary(extraHours: Int) =
 *         baseSalary + (extraCoefficient * extraHours)
 * }
 *
 * val developer = Developer(baseSalary = 50000, extraCoefficient = 200)
 * val totalSalary = developer.calculateSalary(extraHours = 10)
 * println(totalSalary) // Output: 52000
 * ```
 * @property extraCoefficient The coefficient used to calculate the extra salary based on extra hours worked.
 */
interface OvertimeCapable : Employee {
    val extraCoefficient: Int

    /**
     * Calculates the total salary based on the base salary and the extra hours worked.
     *
     * @param extraHours The number of extra hours worked.
     * @return The total salary including extra hours.
     */
    fun calculateSalary(extraHours: Int): Int
}
