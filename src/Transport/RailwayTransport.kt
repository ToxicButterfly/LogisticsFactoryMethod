package Transport

class RailwayTransport(
    override val companyName: String,
    override val maxLiftingCapacity: Int,
    override val maxCargoDimensions: Int,
    val ballastless: Boolean,
    val trackSize: Int
) : Transport {
    override fun deliver() {
        println("Delivery by railway")
    }
}