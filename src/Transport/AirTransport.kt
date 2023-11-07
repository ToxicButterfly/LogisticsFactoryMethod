package Transport

class AirTransport(
    override val companyName: String,
    override val maxLiftingCapacity: Int,
    override val maxCargoDimensions: Int,
    val passengerless: Boolean,
    val deliverType: String
) : Transport {
    override fun deliver() {
        println("Deliver by air")
    }
}