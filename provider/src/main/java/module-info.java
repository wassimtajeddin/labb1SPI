import org.example.provider.EnglishGreeting;
import org.example.provider.SwedishGreeting;
import org.example.service.Greeting;

module org.example.provider {
    requires org.example.service;
    exports org.example.provider;
    provides Greeting with SwedishGreeting,EnglishGreeting ;
}