package cl.ravenhill.twd.characteristics

import cl.ravenhill.twd.humans.Human

private const val INTIMIDATION = 3

/**
 * Interface representing a human wielding Lucille with the ability to increase intimidation.
 *
 * ## Usage:
 * This interface extends the [Human] interface and adds a method for swinging Lucille, which increases the intimidation
 * attribute.
 *
 * ### Example 1: Implementing the LucilleWielder Interface
 * ```
 * class Negan : AbstractHuman(name = "Negan"), LucilleWielder {
 *     override var intimidation: Int = 5
 * }
 *
 * val negan = Negan()
 * println(negan.intimidation) // Output: 5
 * negan.swing()
 * println(negan.intimidation) // Output: 8
 * ```
 * @property name The name of the Lucille wielder.
 * @property intimidation The intimidation attribute of the Lucille wielder, which increases when swinging Lucille.
 */
interface LucilleWielder : Human {
    /**
     * Simulates swinging Lucille, increasing the intimidation.
     */
    fun swing() {
        intimidation += INTIMIDATION
    }
}
