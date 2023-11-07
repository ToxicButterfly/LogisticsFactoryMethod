package Logistics

import Transport.Transport

abstract class Logistics() {

    fun deliverProduct() {
        var trnsp: Transport = createTransport()
        trnsp.deliver()
    }
    abstract fun createTransport(): Transport
}