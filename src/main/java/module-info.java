module com.jtj.task {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jtj.task to javafx.fxml;
    exports com.jtj.task;
}