import Logistics.*

fun main(){
    var str = "Водный"
    var log: Logistics? = gettype(str)
    log?.createTransport()?.deliver()
    str="Железнодорожный"
    log = gettype(str)
    log?.createTransport()?.deliver()
    str="Воздушный"
    log = gettype(str)
    log?.createTransport()?.deliver()
    str="Дорожный"
    log = gettype(str)
    log?.createTransport()?.deliver()

}
fun gettype(str: String): Logistics? {
    var log: Logistics? = null
    when(str){
        "Водный" -> log = WaterLogistics("Какая-то компания", 3000, 12, true)
        "Железнодорожный" -> log = RailwayLogistics("Случайная компания", 200, 4, false, 1435)
        "Воздушный" -> log = AirLogistics("Ещё одна компания", 400, 3, false, "Междугородние")
        "Дорожный" -> log = AutomobileLogistics("Последняя компания", 800, 6)
    }
    return log
}
