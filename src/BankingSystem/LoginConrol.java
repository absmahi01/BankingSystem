package BankingSystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class LoginConrol {

	private Stage stage;
	private Scene scene;
	
   	
	public void loginAsEmployee(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("EmployeePage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.setTitle("Employee Panel");
		scene = new Scene(root);
		
		stage.setScene(scene);
		stage.show();
		}

   
	
	public void loginAsCustomer(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("CustomerPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.setTitle("customer Panel");
		scene = new Scene(root);
		
		stage.setScene(scene);
		stage.show();
		}
	
	
}
