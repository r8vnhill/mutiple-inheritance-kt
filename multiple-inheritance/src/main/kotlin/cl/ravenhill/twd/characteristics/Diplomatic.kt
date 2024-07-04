package cl.ravenhill.twd.characteristics

import cl.ravenhill.twd.humans.Human

/**
 * Interface representing a diplomatic human with the ability to negotiate.
 *
 * ## Usage:
 * This interface extends the [Human] interface and adds a method for negotiation.
 *
 * ### Example 1: Implementing the Diplomatic Interface
 * ```
 * class Governor(name: String) : AbstractHuman(name), Diplomatic
 * class Rick : AbstractHuman("Rick"), Diplomatic
 *
 * val diplomat1 = Governor(name = "Brian")
 * val diplomat2 = Rick(name = "Rick")
 * diplomat1.negotiate(diplomat2)
 * // Output: Brian is negotiating with Rick
 * ```
 * @property name The name of the diplomatic human.
 */
interface Diplomatic : Human {
    /**
     * Simulates negotiation with another diplomatic human.
     *
     * @param diplomatic The other diplomatic human to negotiate with.
     */
    fun negotiate(diplomatic: Diplomatic) = println("$name is negotiating with ${diplomatic.name}")
}
