module com.djstudios.portal {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens com.djstudios.portal to javafx.fxml;
    exports com.djstudios.portal;
}