package cl.ravenhill.employee

/**
 * Represents an intern with a base salary.
 *
 * ## Usage:
 * This class implements the [Employee] interface, providing a specific implementation for an intern with a fixed base
 * salary and a method to calculate the salary without any extra hours.
 *
 * ### Example 1: Creating an Intern and Calculating Salary
 * ```
 * val intern = Intern(baseSalary = 30000)
 * val totalSalary = intern.calculateSalary()
 * println(totalSalary) // Output: 30000
 * ```
 */
class Intern(override val baseSalary: Int) : Employee {
    /**
     * Calculates the total salary based on the base salary.
     *
     * @return The total salary.
     */
    fun calculateSalary() = baseSalary
}

