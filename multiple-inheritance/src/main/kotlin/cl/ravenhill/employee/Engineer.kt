package cl.ravenhill.employee

private const val EXTRA_COEFFICIENT = 10

/**
 * Represents an engineer with a base salary who is capable of development tasks and earning overtime.
 *
 * ## Usage:
 * This class implements both the [Developer] and [OvertimeCapable] interfaces, providing a specific implementation for
 * an engineer with a fixed extra coefficient.
 *
 * ### Example 1: Creating an Engineer and Calculating Salary
 * ```
 * val engineer = Engineer(baseSalary = 60000)
 * val totalSalary = engineer.calculateSalary(extraHours = 5)
 * println(totalSalary) // Output: 60500
 * engineer.develop() // Output: println("Hello, World!")
 * ```
 * @property baseSalary The base salary of the engineer.
 * @property extraCoefficient The coefficient used to calculate the extra salary based on extra hours worked. For an
 * engineer, this is fixed at 10.
 */
class Engineer(override val baseSalary: Int) : Developer, OvertimeCapable {
    override val extraCoefficient = EXTRA_COEFFICIENT
}
