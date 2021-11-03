package BankingSystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;

import banking.InSufficientBalanceException;
import banking.InvalidAccountException;
import banking.MaxWithdawException;


public class TransferMoneyController {
    @FXML
    TextField FromNo;
    @FXML
    TextField ToNo;
    @FXML
    TextField Amount;

    @FXML
    Label level1;
    
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void TransferMoney(ActionEvent event){
        String FromAccNo = FromNo.getText();
        String ToAccNo = ToNo.getText();
        String AmountMoney = Amount.getText();
        Float amount = Float.parseFloat(AmountMoney);

            try {
				Main.bank.transfer(FromAccNo,ToAccNo,amount);
			} catch (InvalidAccountException | InSufficientBalanceException | MaxWithdawException e) {
				
				e.printStackTrace();
			}
            Main.bank.saveData();
            
           level1.setText("Money Transfer successful");

    }

    public void Back(ActionEvent event)  {
        try{
            root =  FXMLLoader.load(getClass().getResource("EmployeePage.fxml"));
            stage =(Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }


        catch (IOException e){
            e.printStackTrace();
        }
        
        
    }
}
