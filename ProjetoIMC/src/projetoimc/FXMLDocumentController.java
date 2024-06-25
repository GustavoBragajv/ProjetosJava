package projetoimc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController {

    @FXML
    private Button btnCalcular;

    @FXML
    private Button btnLimpar;

    @FXML
    private Label lblMensagem;

    @FXML
    private TextField txtAltura;

    @FXML
    private TextField txtIdade;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtPeso;

    @FXML
    public void clicouCalcular(ActionEvent event) {
        // Calculando a altura ao quadrado
        double alturaQuadrada = Double.parseDouble(txtAltura.getText()) * Double.parseDouble(txtAltura.getText());
        String altura = Double.toString(alturaQuadrada);
        
        double peso = Double.parseDouble(txtPeso.getText());
        double imc = peso / alturaQuadrada;
        
        
        
    }

    @FXML
    public void clicouLimpar(ActionEvent event) {
        txtNome.setText("");
        txtIdade.setText("");
        txtAltura.setText("");
        txtPeso.setText("");
    }
    
    
    public void verificarTextFied() {
        int idade = Integer.parseInt(txtIdade.getText());
        double altura = Double.parseDouble(txtAltura.getText());
        double peso = Double.parseDouble(txtPeso.getText());
        
        try {
            lblMensagem.setText("Mostrando o imc: " + String.format("%.2f", imc));
        } catch (NumberFormatException numberFormatException) {
            lblMensagem.setText("Por favor nos campos idade, altura e peso digitar somente valores númericos.");
        }
    }

}
