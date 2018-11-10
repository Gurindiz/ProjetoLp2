package br.com.unialfa.projeto.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class InicialController implements Initializable{
	@FXML
	private GridPane gridInside;
	@FXML
	private ImageView imgInside;
	@FXML
	private Rectangle imgRetangulo;
	@FXML 
	public Pane paneInicial;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		chamarLogon();
	}
	public  void chamarLogon(){
		URL arquivoFXML;
        arquivoFXML = getClass().getResource("view/telaLogon.fxml");
        Parent fxmlParent = null;
		try {
			fxmlParent = (Parent) FXMLLoader.load(arquivoFXML);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        paneInicial.getChildren().clear();
        paneInicial.getChildren().add(fxmlParent);
	       
	}

}
