import com.google.inject.AbstractModule

class AppModule : AbstractModule() {
    override fun configure() {
        bind(Service::class.java).to(ServiceImpl::class.java)
    }
}