package cl.ravenhill.twd.humans

import cl.ravenhill.twd.characteristics.Diplomatic
import cl.ravenhill.twd.characteristics.LucilleWielder

/**
 * Represents the character Negan in an RPG based on "The Walking Dead."
 *
 * ## Usage:
 * This class extends the [AbstractHuman] abstract class and implements the [Diplomatic] and [LucilleWielder]
 * interfaces, providing specific capabilities for the character Negan.
 *
 * ### Example 1: Creating the Negan Character and Using Its Abilities
 * ```
 * val negan = Negan()
 * println(negan.name) // Output: Negan
 * println(negan.speed) // Output: 0
 * println(negan.intimidation) // Output: 0
 * println(negan.damage) // Output: 0
 *
 * // Using the abilities
 * negan.swing()
 * println(negan.intimidation) // Output: 3
 * negan.negotiate(negan)
 * // Output: Negan is negotiating with Negan
 * ```
 * @property name The name of the character, set to "Negan."
 */
class Negan : AbstractHuman(name = "Negan"), Diplomatic, LucilleWielder
