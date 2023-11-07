package Logistics

import Transport.RailwayTransport
import Transport.Transport

class RailwayLogistics(private val companyName: String, private val maxLiftingCapacity: Int, private val maxCargoDimensions: Int, private val ballastless: Boolean, private val trackSize: Int):
    Logistics() {
    override fun createTransport(): Transport {
        return RailwayTransport(companyName, maxLiftingCapacity, maxCargoDimensions, ballastless, trackSize)
    }
}