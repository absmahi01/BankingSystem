package BankingSystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;

public class AccountHandler {
	
	private Parent root;
	private Stage stage;
	private Scene scene;
	
   
	
	public void SavingsAccountHandler(ActionEvent event) throws IOException{
	    root = FXMLLoader.load(getClass().getResource("SavingAccount.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}

  
	public void CurrentAccountHandler(ActionEvent event) throws IOException{
	    root = FXMLLoader.load(getClass().getResource("CurrentAccount.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
	
  
	public void StudentsAccountHandler(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("StudentAccount.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
	
	public void Back(ActionEvent event) throws IOException {
		root =  FXMLLoader.load(getClass().getResource("EmployeePage.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	
	
    }

