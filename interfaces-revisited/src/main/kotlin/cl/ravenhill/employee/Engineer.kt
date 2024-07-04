package cl.ravenhill.employee

/**
 * Represents an engineer with a base salary and the capability to earn overtime.
 *
 * ## Usage:
 * This class implements the [OvertimeCapable] interface, providing a specific implementation for an engineer with a
 * fixed extra coefficient.
 *
 * ### Example 1: Creating an Engineer and Calculating Salary
 * ```
 * val engineer = Engineer(baseSalary = 60000)
 * val totalSalary = engineer.calculateSalary(extraHours = 5)
 * println(totalSalary) // Output: 60500
 * ```
 * @property baseSalary The base salary of the engineer.
 * @property extraCoefficient The coefficient used to calculate the extra salary based on extra hours worked. For an
 *  engineer, this is fixed at 10.
 */
class Engineer(override val baseSalary: Int) : OvertimeCapable {
    override val extraCoefficient = 10
}
