package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;

    @FXML
    private Button helloButton;

    @FXML
    private Button byeButton;

    @FXML
    private CheckBox checkBox;

    public void initialize (){
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    @FXML
    public void onButtonClicked (ActionEvent e) {
        if (e.getSource().equals(helloButton)){
            System.out.println("Hello, " + nameField.getText());
        } else if (e.getSource().equals(byeButton)){
            System.out.println("Bye, " + nameField.getText());
        }
    }

    @FXML
    public void onKeyReleased () {
        String text = nameField.getText();
        boolean disableButtons = text.isBlank() || text.trim().isBlank();
        helloButton.setDisable(disableButtons);
        byeButton.setDisable(disableButtons);
    }
}
