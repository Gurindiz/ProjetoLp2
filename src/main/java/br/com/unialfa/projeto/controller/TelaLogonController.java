package br.com.unialfa.projeto.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class TelaLogonController {
	@FXML
	private Pane panePrincipal;
	@FXML
	private BorderPane bPanePrincipal;
	@FXML
	private GridPane gridPane;
	@FXML
	private ImageView imgInside;
	@FXML
	private Rectangle imgRetangulo;
	@FXML
	private GridPane gridLogin;
	@FXML
	private Label lblUsuario;
	@FXML
	private Label lblSenha;
	@FXML
	private TextField txtUsuario;
	@FXML
	private PasswordField txtSenha;
	@FXML
	private Hyperlink linkEsqueciSenha;
	@FXML
	private HBox hboxBtn;
	@FXML
	private Button btnLimpar;
	@FXML
	private Button btnEntrar;
	@FXML
	private Text txtLogin;
	@FXML
	private Hyperlink linkAjuda;

	@FXML
	public void esqueciSenha(ActionEvent event) {

	}

	@FXML
	public void limparCampos(ActionEvent event) {
		txtUsuario.setText("");
		txtSenha.setText("");
		txtUsuario.requestFocus();
	}


	@FXML
	public void entrar(ActionEvent event) throws Exception{
			}

	private void buscaUser(String msg) {
		
	}
	public boolean validaCampos(){
		String msg = txtUsuario.getText();
		String msg2 = txtSenha.getText();
		List<Control>  controls = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		sb.append("");
		if(msg.equals("")||msg==null){
			sb.append("Digite o Usuário!\n");
			controls.add(txtUsuario);
		}
		if(msg2.equals("")||msg2==null){
			sb.append("Digite a senha!\n");
			controls.add(txtSenha);

		}
		if(!sb.equals("")||sb!=null){
			exibeMensagem(sb.toString());
			animaCamposValidados(controls);
		}
		return sb.toString().isEmpty();
	}
	
	
	@FXML
	public void enter(KeyEvent event) throws Exception {
		
			
	}

	@FXML
	public void help(ActionEvent event) {

	}
	public void initialize(URL location, ResourceBundle resources) {


		txtSenha.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                	try {
						enter(event);
					} catch (Exception e) {
						
						e.printStackTrace();
					} 
                }
            }
        });
	}
	public void animaCamposValidados(List<Control> controls) {
		controls.forEach(control -> {
			RotateTransition rotateTransition = new RotateTransition(Duration.millis(60), control);
			rotateTransition.setFromAngle(-4);
			rotateTransition.setToAngle(4);
			rotateTransition.setCycleCount(8);
			rotateTransition.setAutoReverse(true);
			rotateTransition.setOnFinished((ActionEvent event1) ->{
				control.setRotate(0);
			});
			rotateTransition.play();
		});
		if(!controls.isEmpty()){
			controls.get(0).requestFocus();

		}
	}

	public void exibeMensagem(String msg){
		
	}
}
