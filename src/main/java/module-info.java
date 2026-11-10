module org.example.practicaventanasgmg2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.practicaventanasgmg2 to javafx.fxml;
    exports org.example.practicaventanasgmg2;
}