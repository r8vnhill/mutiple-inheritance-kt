package cl.ravenhill.employee

/**
 * Represents an intern with a base salary.
 *
 * ## Usage:
 * This class implements the [Employee] interface, providing a specific implementation for an intern. The salary
 * calculation does not consider extra hours, as interns do not earn overtime.
 *
 * ### Example 1: Creating an Intern and Calculating Salary
 * ```
 * val intern = Intern(baseSalary = 30000)
 * val totalSalary = intern.calculateSalary(extraHours = 5)
 * println(totalSalary) // Output: 30000
 * ```
 * @property baseSalary The base salary of the intern.
 */
class Intern(override val baseSalary: Int) : Employee {
    /**
     * Calculates the total salary based on the base salary.
     *
     * @param extraHours The number of extra hours worked (not used in the calculation for interns).
     * @return The total salary.
     */
    fun calculateSalary(extraHours: Int) = baseSalary
}
