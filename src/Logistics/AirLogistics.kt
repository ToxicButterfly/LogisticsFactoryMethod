package Logistics

import Transport.AirTransport
import Transport.Transport

class AirLogistics(private val companyName: String, private val maxLiftingCapacity: Int, private val maxCargoDimensions: Int, private val passengerless: Boolean, private val deliverType: String):Logistics() {
    override fun createTransport(): Transport {
        return AirTransport(companyName, maxLiftingCapacity, maxCargoDimensions, passengerless, deliverType)
    }
}