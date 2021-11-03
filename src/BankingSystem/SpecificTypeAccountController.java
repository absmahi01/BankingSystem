package BankingSystem;

import banking.BankAccount;
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
import java.io.IOException;

public class SpecificTypeAccountController
{
    @FXML
    TextField AccountType;
    @FXML
    ListView<String> listView;


    private Parent root;
	private Stage stage;
	private Scene scene;
    
    
public void specificAccountTypeShow(ActionEvent event){
    String accountType = AccountType.getText();
    ObservableList<BankAccount> list3 = FXCollections.observableArrayList(Main.bank.getAccounts(accountType));
    for(int i = 0;i<list3.size();i++){
       listView.getItems().addAll(list3.get(i).toString());
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
