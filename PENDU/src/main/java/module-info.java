module mns.java.PENDU {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens mns.java.PENDU to javafx.fxml;
    exports mns.java.PENDU;
}
