//
//class Company(val companyName: String, val str: String, val maxLiftingCapacity: Int, val maxCargoDimensions: Int, val _type: Boolean = true, trackSize: Int = 1435, deliverType: String = "Внутригородские") {
//    var log: Logistics.Logistics? = null
//    fun createLogistics() {
//        when(str){
//            "Водный" -> log = Logistics.WaterLogistics(companyName, maxLiftingCapacity, maxCargoDimensions, _type)
//       //     "Железнодорожный" -> log = RailwayLogistics()
//        }
//    }
//}