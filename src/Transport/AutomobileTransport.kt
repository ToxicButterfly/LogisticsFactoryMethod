package Transport

class AutomobileTransport(
    override val companyName: String,
    override val maxLiftingCapacity: Int,
    override val maxCargoDimensions: Int
) : Transport {
    override fun deliver() {
        println("Deliver by road")
    }
}