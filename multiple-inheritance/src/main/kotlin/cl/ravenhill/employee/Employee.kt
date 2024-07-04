package cl.ravenhill.employee


/**
 * Interface representing an employee with a base salary.
 *
 * ## Usage:
 * This interface defines the contract for employee types, requiring implementations to provide a base salary.
 *
 * ### Example 1: Implementing the Employee Interface
 * ```
 * class SomeEmployee(override val baseSalary: Int) : Employee
 * ```
 * @property baseSalary The base salary of the employee.
 */
interface Employee {
    val baseSalary: Int
}
