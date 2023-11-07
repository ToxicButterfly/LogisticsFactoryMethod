package Logistics

import Transport.AutomobileTransport
import Transport.Transport

class AutomobileLogistics(private val companyName: String, private val maxLiftingCapacity: Int, private val maxCargoDimensions: Int): Logistics() {
    override fun createTransport(): Transport {
        return AutomobileTransport(companyName, maxLiftingCapacity, maxCargoDimensions)
    }
}