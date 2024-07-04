package cl.ravenhill.employee


/**
 * Interface representing an employee with a base salary.
 *
 * ## Usage:
 * This interface defines the contract for employee types, requiring implementations to provide a base salary.
 *
 * ### Example 1: Implementing the Employee Interface
 * ```
 * class Developer(override val baseSalary: Int) : Employee
 *
 * val developer = Developer(baseSalary = 50000)
 * println(developer.baseSalary) // Output: 50000
 * ```
 * @property baseSalary The base salary of the employee.
 */
interface Employee {
    val baseSalary: Int
}
