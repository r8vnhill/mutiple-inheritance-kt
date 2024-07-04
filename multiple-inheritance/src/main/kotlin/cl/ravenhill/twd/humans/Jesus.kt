package cl.ravenhill.twd.humans

import cl.ravenhill.twd.characteristics.Diplomatic
import cl.ravenhill.twd.characteristics.HorseRider
import cl.ravenhill.twd.characteristics.Shooter

/**
 * Represents the character Jesus in an RPG based on "The Walking Dead."
 *
 * ## Usage:
 * This class extends the [AbstractHuman] abstract class and implements the [Diplomatic], [HorseRider], and [Shooter]
 * interfaces, providing specific capabilities for the character Jesus.
 *
 * ### Example 1: Creating the Jesus Character and Using Its Abilities
 * ```
 * val jesus = Jesus()
 * println(jesus.name) // Output: Jesus
 * println(jesus.speed) // Output: 0
 * println(jesus.intimidation) // Output: 0
 * println(jesus.damage) // Output: 0
 *
 * // Using the abilities
 * jesus.ride()
 * println(jesus.speed) // Output: 6
 * jesus.shoot()
 * println(jesus.damage) // Output: 10
 * jesus.negotiate(jesus)
 * // Output: Jesus is negotiating with Jesus
 * ```
 * @property name The name of the character, set to "Jesus."
 */
class Jesus : AbstractHuman(name = "Jesus"), Diplomatic, HorseRider, Shooter