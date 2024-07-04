package cl.ravenhill.employee

/**
 * Interface representing a developer with a base salary.
 *
 * ## Usage:
 * This interface extends the [Employee] interface and adds a method for development tasks.
 *
 * ### Example 1: Implementing the Developer Interface
 * ```
 * class SoftwareDeveloper(override val baseSalary: Int) : Developer
 *
 * val developer = SoftwareDeveloper(baseSalary = 70000)
 * developer.develop() // Output: println("Hello, World!")
 * println(developer.baseSalary) // Output: 70000
 * ```
 * @property baseSalary The base salary of the developer.
 */
interface Developer : Employee {
    /**
     * Simulates the development task by printing a simple "Hello, World!" program.
     */
    fun develop() = println("""println("Hello, World!")""")
}
