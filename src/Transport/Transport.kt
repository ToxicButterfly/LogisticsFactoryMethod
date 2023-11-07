package Transport
interface Transport {
    val companyName: String
    val maxLiftingCapacity: Int
    val maxCargoDimensions: Int

    fun deliver()
}