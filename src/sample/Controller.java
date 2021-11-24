package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class Controller {

    public Label welcomeText;
    public TextField textField;
    public Label eletkorLabel;
    public Spinner<Integer> eletkor;
    public ListView lista;

    public void felvetelClick(ActionEvent actionEvent) {
        lista.getItems().add(textField.getText() + " : " + eletkor.getValue());
    }
}