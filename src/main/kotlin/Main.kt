import com.google.inject.Guice

fun main(args: Array<String>) {
    val injector = Guice.createInjector(AppModule())
    val service = injector.getInstance(Service::class.java)
    service.execute()
}