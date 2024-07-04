package cl.ravenhill.twd.humans

/**
 * Interface representing a human with a name.
 *
 * ## Usage:
 * This interface defines the contract for human types, requiring implementations to provide a name.
 *
 * ### Example 1: Implementing the Human Interface
 * ```
 * class Person(override val name: String) : Human
 *
 * val person = Person(name = "John Doe")
 * println(person.name) // Output: John Doe
 * ```
 * @property name The name of the human.
 * @property speed The speed of the human.
 * @property intimidation The intimidation factor of the human.
 * @property damage The damage dealt by the human.
 */
interface Human {
    val name: String
    var speed: Int
    var intimidation: Int
    var damage: Int
}
