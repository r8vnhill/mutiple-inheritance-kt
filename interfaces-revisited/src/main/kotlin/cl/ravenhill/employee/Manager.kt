package cl.ravenhill.employee

/**
 * Represents a manager with a base salary and the capability to earn overtime.
 *
 * ## Usage:
 * This class implements the [OvertimeCapable] interface, providing a specific implementation for a manager with a fixed
 * extra coefficient.
 *
 * ### Example 1: Creating a Manager and Calculating Salary
 * ```
 * val manager = Manager(baseSalary = 80000)
 * val totalSalary = manager.calculateSalary(extraHours = 5)
 * println(totalSalary) // Output: 81000
 * ```
 * @property baseSalary The base salary of the manager.
 * @property extraCoefficient The coefficient used to calculate the extra salary based on extra hours worked. For a
 *  manager, this is fixed at 20.
 */
class Manager(override val baseSalary: Int) : OvertimeCapable {
    override val extraCoefficient = 20
}
