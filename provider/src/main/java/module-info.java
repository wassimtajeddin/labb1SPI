import org.example.provider.KiloGramToGram;
import org.example.provider.MeterToFeet;
import org.example.service.ConvertKgToG;
import org.example.service.ConvertMToFeet;

module org.example.provider {
    requires org.example.service;
    exports org.example.provider;
    provides ConvertKgToG with KiloGramToGram;
    provides ConvertMToFeet with MeterToFeet;
}