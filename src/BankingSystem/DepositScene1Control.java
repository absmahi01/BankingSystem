package BankingSystem;

import java.io.IOException;

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

public class DepositScene1Control {
	@FXML 
	TextField numberTextField;
	@FXML
	TextField amountTextField;
	@FXML
    Label level;
	
	private Parent root;
	private Stage stage;
	private Scene scene;
	
	public void Back(ActionEvent event) throws IOException {
		root =  FXMLLoader.load(getClass().getResource("EmployeePage.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
	public void Deposit(ActionEvent event) {
		String accountNumber = numberTextField.getText();
		double amount = Double.parseDouble(amountTextField.getText());
		try {
			Main.bank.deposit(accountNumber, amount);
		} catch (InvalidAccountException e) {
			e.printStackTrace();
		}
		Main.bank.saveData();
		
		level.setText("Deposition successful");
	}
}
