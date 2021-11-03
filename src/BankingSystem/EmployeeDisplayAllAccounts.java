package BankingSystem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import banking.BankAccount;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

	public class EmployeeDisplayAllAccounts implements Initializable {
		@FXML
		private Label myLabel;
		
		@FXML
		private ListView<String>list;

	   
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
		
       		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			ObservableList<BankAccount> info = FXCollections.observableArrayList(Main.bank.getAccounts());
			for(int i=0; i < info.size();i++) {
				list.getItems().addAll(info.get(i).toString());
			
		} 
			
		}
		
		
		
	}
	


