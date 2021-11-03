package BankingSystem;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class SavingAccountController {

	@FXML
	TextField name; 
	@FXML
	TextField nid;
	@FXML
	TextField limit;
	@FXML
	TextField balance;
	
	@FXML
    ListView<String> listView;
	
	private Parent root;
	private Stage stage;
	private Scene scene;
	
	
	public void Back(ActionEvent event) throws IOException {
		root =  FXMLLoader.load(getClass().getResource("AccountHandler.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
public void addMember(ActionEvent event) {
	String memberName = name.getText();
	String Nid = nid.getText();
	String Balance = balance.getText();
	double depAmount = Double.parseDouble(Balance);
	String Limit = limit.getText();
	double maxLimit = Double.parseDouble(Limit);
	Main.bank.addAccount(memberName, Nid, depAmount, maxLimit);
	Main.bank.saveData();
	
	
	String acNum = Main.bank.addAccount(memberName, Nid, depAmount, maxLimit);
	listView.getItems().addAll("Saving account number: "+acNum);

}

	
}
