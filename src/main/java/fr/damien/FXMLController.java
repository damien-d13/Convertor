package fr.damien;
/*
Put header here


 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    @FXML
    private Label lblOut;

    @FXML
    private TextField othercurrency;

    @FXML
    private TextField yourcurrency;

    @FXML
    private TextField currencytobeconvert;
    
    @FXML
    private void onConvertAction(ActionEvent event) {
        float conversionValue = (Float.parseFloat(yourcurrency.getText()) / Float.parseFloat(othercurrency.getText())) * (Float.parseFloat(currencytobeconvert.getText()));
        lblOut.setText(Float.toString(conversionValue));
        lblOut.setText(String.format("%.2f",conversionValue));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lblOut.setText("0");
    }    
}
