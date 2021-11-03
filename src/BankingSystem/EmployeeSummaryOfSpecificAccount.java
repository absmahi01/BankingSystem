package BankingSystem;

import java.io.IOException;
import banking.BankAccount;
import banking.InvalidAccountException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EmployeeSummaryOfSpecificAccount {

	@FXML
	TextField accNumTF;
	
	@FXML
	Label SingleTF;
	

	private Parent root;
	private Stage stage;
	private Scene scene;
	
	
	
	public void fndAccount(ActionEvent event) throws InvalidAccountException {
		String accNum = accNumTF.getText();
		
		BankAccount accounts = Main.bank.findAccount(accNum);
		
		SingleTF.setText("\t\t\t\t\t\tWelcome \n"+accounts);
		
	}
	
	public void Back(ActionEvent event) throws IOException {
		root =  FXMLLoader.load(getClass().getResource("EmployeePage.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
	
	
}
