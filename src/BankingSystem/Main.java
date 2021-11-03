package BankingSystem;

import banking.Bank;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import banking.DataHandler;

public class Main extends Application {
	static Stage primaryStage;
	public static Bank bank = null;
    
    @Override
    public void start(Stage stage) throws Exception{
    	primaryStage = stage;
        
    	try {
			
			
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPage.fxml"));
    	    Parent root = loader.load();
			Scene scene = new Scene(root);
			stage.setTitle("Banking System");
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//String css = this.getClass().getResource("application.css").toExternalForm();
			//scene.getStylesheets().add(css);
			
			stage.setScene(scene);
			stage.show();
			//stage.setFullScreen(true);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
    	
    	
   
public static void main(String[] args) {
    try {
        bank = DataHandler.readData();
    } catch (Exception e) {
        bank = new Bank("DBBL");
    }
    
    launch(args);
}
}
