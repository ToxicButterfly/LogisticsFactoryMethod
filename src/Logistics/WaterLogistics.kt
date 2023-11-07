package Logistics

import Transport.Transport
import Transport.WaterTransport

class WaterLogistics(private val companyName: String, private val maxLiftingCapacity: Int, private val maxCargoDimensions: Int, private val riverType: Boolean) :
    Logistics() {
    override fun createTransport(): Transport {
        return WaterTransport(companyName, maxLiftingCapacity, maxCargoDimensions, riverType)
    }

}