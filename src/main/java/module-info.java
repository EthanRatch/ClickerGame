module groundwave.clicker.clicker {
    requires javafx.controls;
    requires javafx.fxml;


    opens groundwave.clicker.clicker to javafx.fxml;
    exports groundwave.clicker.clicker;
}