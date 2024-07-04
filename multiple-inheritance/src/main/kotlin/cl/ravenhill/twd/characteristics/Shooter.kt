package cl.ravenhill.twd.characteristics

import cl.ravenhill.twd.humans.Human

private const val SHOOTER_DAMAGE = 10

/**
 * Interface representing a shooter with the ability to increase damage by shooting.
 *
 * ## Usage:
 * This interface extends the [Human] interface and adds a method for shooting, which increases the damage attribute.
 *
 * ### Example 1: Implementing the Shooter Interface
 * ```
 * class Dale : AbstractHuman(name = "Dale"), Shooter {
 *    override var damage: Int = 5
 * }
 *
 * val dale = Dale()
 * println(dale.damage) // Output: 5
 * dale.shoot()
 * println(sniper.damage) // Output: 15
 * ```
 * @property name The name of the shooter.
 * @property damage The damage attribute of the shooter, which increases when shooting.
 */
interface Shooter : Human {
    /**
     * Simulates shooting, increasing the damage.
     */
    fun shoot() {
        damage += SHOOTER_DAMAGE
    }
}
