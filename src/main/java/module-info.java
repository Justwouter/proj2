module com.gui {
    requires transitive javafx.controls;
    requires transitive javafx.base;
    requires transitive javafx.graphics;
    requires transitive javafx.media;
    requires javafx.fxml;
    requires com.google.gson;

    opens com.gui to javafx.fxml;
    exports com.gui;
    exports com.logic;
}
