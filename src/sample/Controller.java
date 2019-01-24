package sample;

import com.sun.jdi.Value;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import java.awt.event.ActionEvent;

public class Controller {
    @FXML private RadioButton rb1;
    @FXML private RadioButton rb2;
    @FXML private Label lb1;

    public void radioSelect(ActionEvent event) {
        String message="";
        if (rb1.isSelected()) {
            message += rb1.getText() + "\n";
        } else if (rb2.isSelected()) {
            message += rb2.getText() + "\n";
        }
        lb1.setText(message);
    }
}
