package sample;

import com.sun.jdi.PrimitiveValue;
import com.sun.jdi.Value;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.text.Text;

import java.awt.event.ActionEvent;
import java.util.Random;

public class Controller {
    @FXML Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @FXML private RadioButton rb1, rb2;
    @FXML private Label lb1;
    @FXML private Button bt1;
    private String p1 = "Player 1";
    private String p2 = "Player 2";
    private char letra;
    private char turnotext;
    Random random = new Random();
    private boolean turno = random.nextBoolean();


    @FXML public void clickButton(ActionEvent event) {
        if (rb2.isSelected()) {
            setTextButton();
            Button b = (Button) event.getSource();
            b.setText(String.valueOf(letra));
        }

    }

    public void start(){
        setTextButton();
    }

    public boolean setTextButton() {
        String message="TURNO DE: ";
        if (turno == true) {
            letra ='X';
            turnotext = 'O';
            lb1.setText(message + turno);
            turno = false;
        }else {
            letra ='O';
            turnotext = 'X';
            lb1.setText(message + turno);
            turno = true;
        }
        return true;
    }
}
