package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label label;
    @FXML
    private TextField textField;

    @FXML
    protected void handle(ActionEvent event) {
        label.setText(textField.getText());
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
