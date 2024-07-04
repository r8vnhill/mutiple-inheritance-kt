package cl.ravenhill.twd.humans

/**
 * Abstract class representing a human in an RPG based on "The Walking Dead" with attributes such as speed,
 * intimidation, and damage.
 *
 * ## Usage:
 * This abstract class implements the [Human] interface and provides additional attributes relevant to an RPG setting.
 * It can be extended by specific human types to reuse and enhance the attributes and functionalities.
 *
 * ### Example 1: Extending AbstractHuman
 * ```
 * class Rick : AbstractHuman(name = "Rick Grimes")
 *
 * val rick = Rick()
 * println(rick.name) // Output: Rick Grimes
 * println(rick.speed) // Output: 0
 * println(rick.intimidation) // Output: 0
 * println(rick.damage) // Output: 0
 * ```
 * @property name The name of the human.
 * @property speed The speed attribute of the human. Default is 0.
 * @property intimidation The intimidation attribute of the human. Default is 0.
 * @property damage The damage attribute of the human. Default is 0.
 */
abstract class AbstractHuman(override val name: String) : Human {
    override var speed = 0
    override var intimidation = 0
    override var damage = 0
}
