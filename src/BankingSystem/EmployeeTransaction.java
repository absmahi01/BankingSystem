package BankingSystem;

import java.io.IOException;

import banking.InvalidAccountException;
import banking.Transaction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EmployeeTransaction {
	@FXML
	TextField accNum;
	
	@FXML
	public ListView<String> listV;
	
	private Parent root;
	private Stage stage;
	private Scene scene;
	
	public void display(ActionEvent event) {
		listV.getItems().clear();
		String accountNumber = accNum.getText();
		
		try {
			ObservableList<Transaction> list = FXCollections.observableArrayList(Main.bank.getAccTransactions(accountNumber));
			for(int i=0; i<list.size();i++) {
				listV.getItems().addAll(list.get(i).toString());
			}
		} catch (InvalidAccountException e) {
			listV.getItems().addAll("Sorry account "+ accountNumber + " not found");
			e.printStackTrace();
		}
		
	}
	public void Back(ActionEvent event) throws IOException {
		root =  FXMLLoader.load(getClass().getResource("EmployeePage.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}

