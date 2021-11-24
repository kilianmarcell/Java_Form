package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public Label welcomeText;
    public TextField textField;

    public void helloClick(ActionEvent actionEvent) {
        welcomeText.setText("Szia "+ textField.getText());
        Alert alert = new Alert(Alert.AlertType.NONE, "Hello " + textField.getText(), ButtonType.OK);
        alert.show();
    }
}