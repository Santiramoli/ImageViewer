module software.ulpgc.imageviewer.iv {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens software.ulpgc.imageviewer.iv to javafx.fxml;
    exports software.ulpgc.imageviewer.iv;
}