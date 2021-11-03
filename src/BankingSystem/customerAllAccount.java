package BankingSystem;

import java.io.IOException;
import banking.BankAccount;
import banking.InvalidAccountException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class customerAllAccount
{

	@FXML
	TextField nidTF;
	
	@FXML
	Label DisplayAllAcc;
	
	private Parent root;
	private Stage stage;
	private Scene scene;

	@FXML
	ListView<String> list;
	
	public void Back(ActionEvent event) throws IOException {
		root =  FXMLLoader.load(getClass().getResource("CustomerPage.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
		
		
	}
	public void allAccount(ActionEvent event) throws InvalidAccountException {
		
		String nid = nidTF.getText();
		ObservableList<BankAccount> list2 = FXCollections.observableArrayList(Main.bank.findAccounts(nid));
		for(int i=0; i < list2.size();i++) {
			list.getItems().addAll(list2.get(i).toString());

		}
		
		
	}
	
	}
	

