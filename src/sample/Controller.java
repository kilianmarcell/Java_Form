package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class Controller {

    public Label welcomeText;
    public TextField textField;
    public Label eletkorLabel;
    public Spinner<Integer> eletkor;

    public void felvetelClick(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setContentText("Szia " + textField.getText());
        alert.getButtonTypes().add(ButtonType.OK);
        alert.showAndWait();
        welcomeText.setText("Szia "+ textField.getText());
}
    }
