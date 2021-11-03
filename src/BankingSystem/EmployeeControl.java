package BankingSystem;

import java.io.IOException;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class EmployeeControl {
	private Stage stage;
	private Parent root;
	private Scene scene;
	
	public void addMember(ActionEvent event) throws IOException {
		
		Parent root =  FXMLLoader.load(getClass().getResource("AccountHandler.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
	    Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
		}

	public void deposit(ActionEvent event) throws IOException {
		Stage stage = Main.primaryStage;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("DepositScene1.fxml"));
	    Parent root = loader.load();
	    Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void withdraw(ActionEvent event) throws IOException {
		
		Stage stage = Main.primaryStage;
		//Stage stage = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("withdrawColtroller.fxml"));
	    Parent root = loader.load();
	    Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void TranserMoney(ActionEvent event) throws IOException {
		
		Stage stage = Main.primaryStage;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("TransferMoney.fxml"));
	    Parent root = loader.load();
	    Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void SummarySpecific(ActionEvent event) throws IOException {
		Stage stage = Main.primaryStage;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("SummaryOfSpecificAccount.fxml"));
	    Parent root = loader.load();
	    Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void TransationSpecific(ActionEvent event) throws IOException {
		Stage stage = Main.primaryStage;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("EmployeeTransactionSpecific.fxml"));
	    Parent root = loader.load();
	    Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void ListSpecificTypes(ActionEvent event) throws IOException {
		Stage stage = Main.primaryStage;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("SpecificTypeAccount.fxml"));
	    Parent root = loader.load();
	    Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void DisplayAllAccounts(ActionEvent event) throws IOException {
		
		Stage stage = Main.primaryStage;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("EmployeeDisplayAllAccounts.fxml"));
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
