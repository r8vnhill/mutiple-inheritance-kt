package cl.ravenhill.employee

/**
 * Represents an engineer with a base salary.
 *
 * ## Usage:
 * This class extends the [AbstractEmployee] abstract class, providing a specific implementation for an engineer with a
 * fixed extra coefficient.
 *
 * ### Example 1: Creating an Engineer and Calculating Salary
 * ```
 * val engineer = Engineer(baseSalary = 60000)
 * val totalSalary = engineer.calculateSalary(extraHours = 5)
 * println(totalSalary) // Output: 60500
 * ```
 * @param baseSalary The base salary of the engineer.
 */
class Engineer(override val baseSalary: Int) : OvertimeCapable {
    override val extraCoefficient = 10
    override fun calculateSalary(extraHours: Int) = baseSalary + (extraCoefficient * extraHours)
}
