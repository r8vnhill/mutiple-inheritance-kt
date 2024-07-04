package cl.ravenhill.employee

/**
 * Represents a manager with a base salary.
 *
 * ## Usage:
 * This class extends the [AbstractEmployee] abstract class, providing a specific implementation for a manager with a
 * fixed extra coefficient.
 *
 * ### Example 1: Creating a Manager and Calculating Salary
 * ```
 * val manager = Manager(baseSalary = 80000)
 * val totalSalary = manager.calculateSalary(extraHours = 5)
 * println(totalSalary) // Output: 81000
 * ```
 * @param baseSalary The base salary of the manager.
 */
class Manager(override val baseSalary: Int) : OvertimeCapable {
    override val extraCoefficient = 100
    override fun calculateSalary(extraHours: Int) = baseSalary + (extraCoefficient * extraHours)
}
