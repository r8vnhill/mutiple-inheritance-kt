package cl.ravenhill.employee

/**
 * Represents an intern with a base salary who is capable of development tasks.
 *
 * ## Usage:
 * This class implements the [Developer] interface, providing a specific implementation for an intern. The salary
 * calculation does not consider extra hours, as interns do not earn overtime.
 *
 * ### Example 1: Creating an Intern and Calculating Salary
 * ```
 * val intern = Intern(baseSalary = 30000)
 * val totalSalary = intern.calculateSalary()
 * println(totalSalary) // Output: 30000
 * intern.develop() // Output: println("Hello, World!")
 * ```
 * @property baseSalary The base salary of the intern.
 */
class Intern(override val baseSalary: Int) : Developer {
    /**
     * Calculates the total salary based on the base salary.
     *
     * @return The total salary.
     */
    fun calculateSalary() = baseSalary
}
