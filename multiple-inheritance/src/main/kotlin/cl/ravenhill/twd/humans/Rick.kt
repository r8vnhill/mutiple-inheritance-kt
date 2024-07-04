package cl.ravenhill.twd.humans

import cl.ravenhill.twd.characteristics.Diplomatic
import cl.ravenhill.twd.characteristics.Shooter

/**
 * Represents the character Rick in an RPG based on "The Walking Dead."
 *
 * ## Usage:
 * This class extends the [AbstractHuman] abstract class and implements the [Diplomatic] and [Shooter] interfaces,
 * providing specific capabilities for the character Rick.
 *
 * ### Example 1: Creating the Rick Character and Using Its Abilities
 * ```
 * val rick = Rick()
 * println(rick.name) // Output: Rick
 * println(rick.speed) // Output: 0
 * println(rick.intimidation) // Output: 0
 * println(rick.damage) // Output: 0
 *
 * // Using the abilities
 * rick.shoot()
 * println(rick.damage) // Output: 10
 * rick.negotiate(rick)
 * // Output: Rick is negotiating with Rick
 * ```
 * @property name The name of the character, set to "Rick."
 */
class Rick : AbstractHuman("Rick"), Diplomatic, Shooter
