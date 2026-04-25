package atm;

import atm.model.*;
import atm.ui.*;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ATMApp extends Application {

    private Stage stage;
    private Bank bank = new Bank();
    private Account currentAccount;

    @Override
    public void start(Stage stage) {
        this.stage = stage;
        stage.setTitle("ATM Simulator");
        showLogin();
        stage.show();
    }

    private Scene createScene(Parent root) {
        Scene scene = new Scene(root, 400, 350);
        scene.getStylesheets().add(
                getClass().getResource("/style.css").toExternalForm()
        );
        return scene;
    }

    public void showLogin() {
        stage.setScene(createScene(new LoginView(this, bank)));
    }

    public void showMenu(Account acc) {
        this.currentAccount = acc;
        stage.setScene(createScene(new MenuView(this, acc)));
    }

    public void showTransaction(String type) {
        stage.setScene(createScene(
                new TransactionView(this, currentAccount, type)
        ));
    }
}