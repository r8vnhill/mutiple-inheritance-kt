package cl.ravenhill.employee

/**
 * Represents an intern with a base salary.
 *
 * ## Usage:
 * This class extends the [AbstractEmployee] abstract class, providing a specific implementation for an intern with a
 * fixed extra coefficient.
 *
 * ### Example 1: Creating an Intern and Calculating Salary
 * ```
 * val intern = Intern(baseSalary = 30000)
 * val totalSalary = intern.calculateSalary(extraHours = 5)
 * println(totalSalary) // Output: 30250
 * ```
 */
class Intern(override val baseSalary: Int) : Employee {
    fun calculateSalary(extraHours: Int) = baseSalary
}
