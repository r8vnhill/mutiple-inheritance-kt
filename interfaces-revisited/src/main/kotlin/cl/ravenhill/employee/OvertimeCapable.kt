package cl.ravenhill.employee

interface OvertimeCapable : Employee {
    val extraCoefficient: Int

    /**
     * Calculates the total salary based on the base salary and the extra hours worked.
     *
     * @param extraHours The number of extra hours worked.
     * @return The total salary including extra hours.
     */
    fun calculateSalary(extraHours: Int): Int
}