package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import javax.swing.border.EmptyBorder;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    public Label welcomeText;
    public TextField textField;
    public Label eletkorLabel;
    public Spinner<Integer> eletkor;
    public ListView<Ember> lista;


    public void felvetelClick(ActionEvent actionEvent) {
        Ember e = new Ember(textField.getText(), eletkor.getValue());
        lista.getItems().add(e);
    }
}