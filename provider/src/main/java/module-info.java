import org.example.provider.KiloGramToGram;
import org.example.provider.MeterToFeet;
import org.example.service.Convert;

module org.example.provider {
    requires org.example.service;
    exports org.example.provider;
    provides Convert with KiloGramToGram, MeterToFeet;
}