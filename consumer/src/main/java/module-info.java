import org.example.service.Convert;

module org.example.consumer {
    requires java.base;
    requires org.example.service;
    uses Convert;
}