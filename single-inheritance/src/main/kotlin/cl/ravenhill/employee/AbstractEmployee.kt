package cl.ravenhill.employee

/**
 * Abstract class representing an employee with a base salary and an extra coefficient.
 *
 * ## Usage:
 * This abstract class provides a concrete implementation of the `calculateSalary` method from the [Employee] interface.
 * It can be extended by specific employee types to reuse the salary calculation logic.
 *
 * ### Example 1: Extending AbstractEmployee
 * ```
 * class Developer(baseSalary: Int, extraCoefficient: Int) : AbstractEmployee(baseSalary, extraCoefficient)
 *
 * val developer = Developer(baseSalary = 50000, extraCoefficient = 200)
 * val totalSalary = developer.calculateSalary(extraHours = 10)
 * println(totalSalary) // Output: 52000
 * ```
 */
abstract class AbstractEmployee(
    override val baseSalary: Int,
    override val extraCoefficient: Int
) : Employee {
    override fun calculateSalary(extraHours: Int): Int =
        baseSalary + extraHours * extraCoefficient
}
