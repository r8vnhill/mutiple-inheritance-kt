package cl.ravenhill.twd.characteristics

import cl.ravenhill.twd.humans.Human

private const val HORSE_RIDER_SPEED = 6

/**
 * Interface representing a horse rider with the ability to increase speed while riding.
 *
 * ## Usage:
 * This interface extends the [Human] interface and adds a method for riding a horse, which increases the speed
 * attribute.
 *
 * ### Example 1: Implementing the HorseRider Interface
 * ```
 * class Andrea : AbstractHuman(name = "Andrea"), HorseRider {
 *     override var speed: Int = 10
 * }
 *
 * val andrea = Andrea()
 * println(andrea.speed) // Output: 10
 * knight.ride()
 * println(knight.speed) // Output: 16
 * ```
 * @property name The name of the horse rider.
 * @property speed The speed attribute of the horse rider, which increases when riding.
 */
interface HorseRider : Human {
    /**
     * Simulates riding a horse, increasing the speed.
     */
    fun ride() {
        speed += HORSE_RIDER_SPEED
    }
}
