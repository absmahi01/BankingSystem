package BankingSystem;

import java.io.IOException;

import banking.InSufficientBalanceException;
import banking.InvalidAccountException;
import banking.MaxWithdawException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class withdrawColtroller {

	@FXML
	TextField AccNum; 
	@FXML
	TextField withAmt; 
	
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
	
	
public void withdraw(ActionEvent event) {
	
	String WithAmou = withAmt.getText();
	double WithAmount = Double.parseDouble(WithAmou);
	String AccounNum = AccNum.getText();
	
	try {
		Main.bank.withdraw(AccounNum, WithAmount);
	} catch (InvalidAccountException | InSufficientBalanceException | MaxWithdawException e) {
		
		e.printStackTrace();
	}
	Main.bank.saveData();
	
	level.setText("Withdraw successful");

}

	

}
