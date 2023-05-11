import org.example.service.ConvertKgToG;
import org.example.service.ConvertMToFeet;

module org.example.consumer {
    requires java.base;
    requires org.example.service;
    uses ConvertKgToG;
    uses ConvertMToFeet;
}