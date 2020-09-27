package home;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import org.apache.commons.lang3.RandomStringUtils;

public class Controller {

    @FXML
    private Button generate;
    @FXML
    private TextField input;
    @FXML
    private CheckBox letters;
    @FXML
    private TextField resultCode;


    public void pressButton(ActionEvent btnPressedEvent) {
        int size = Integer.parseInt(input.getText());

        if(letters.isSelected()){
            String result = RandomStringUtils.random(size, 0, 128, true, true);
            resultCode.setText(result);
        } else {
            String result = RandomStringUtils.random(size, false, true);
            resultCode.setText(result);
        }


    }
}
