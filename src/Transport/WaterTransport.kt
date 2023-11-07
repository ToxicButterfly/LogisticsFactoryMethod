package Transport

import Transport.Transport

class WaterTransport(
    override val companyName: String,
    override val maxLiftingCapacity: Int,
    override val maxCargoDimensions: Int,
    val riverType: Boolean
) : Transport {
    override fun deliver() {
        println("Deliver by water")
    }
}