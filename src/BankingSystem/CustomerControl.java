package BankingSystem;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class CustomerControl {

	private Parent root;
	private Stage stage;
	private Scene scene;
		
	public void summaryOfHisAccount(ActionEvent event) throws IOException {
		Stage stage = Main.primaryStage;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("CustomerSpecific.fxml"));
	    Parent root = loader.load();
	    Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
	public void TransactionOfHisAccount(ActionEvent event) throws IOException {
		Stage stage = Main.primaryStage;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("customerTransaction.fxml"));
	    Parent root = loader.load();
	    Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
		}
	public void DisplayOfHisAllAccount(ActionEvent event) throws IOException {
		Stage stage = Main.primaryStage;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("customerAllAccount.fxml"));
	    Parent root = loader.load();
	    Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
		}
	public void Home(ActionEvent event) throws IOException {
		root =  FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
