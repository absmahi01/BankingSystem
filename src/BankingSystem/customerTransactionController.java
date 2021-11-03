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

public class customerTransactionController {
	@FXML
	TextField accNum;
	@FXML
	TextField nid;
	
	@FXML
	public ListView<String> listView;
	
	private Parent root;
	private Stage stage;
	private Scene scene;
	
	public void displayTransaction(ActionEvent event) {
		listView.getItems().clear();
		String accountNumber = accNum.getText();
		String nidNumber = nid.getText();
		
		try {
			ObservableList<Transaction> list = FXCollections.observableArrayList(Main.bank.getAccTransactions(nidNumber, accountNumber));
			for(int i=0; i < list.size();i++) {
				listView.getItems().addAll(list.get(i).toString());
			}
		} catch (InvalidAccountException e) {
			listView.getItems().addAll("Sorry account "+ accountNumber + " not found");
			e.printStackTrace();
		}
		
	}
	public void Back(ActionEvent event) throws IOException {
		root =  FXMLLoader.load(getClass().getResource("CustomerPage.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}