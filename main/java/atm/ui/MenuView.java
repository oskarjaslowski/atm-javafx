package atm.ui;

import atm.ATMApp;
import atm.model.Account;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class MenuView extends VBox {

    public MenuView(ATMApp app, Account acc) {
        setSpacing(15);
        setAlignment(Pos.CENTER);

        Label balance = new Label("Balance: $" + acc.getBalance());

        Button deposit = new Button("Deposit");
        Button withdraw = new Button("Withdraw");
        Button logout = new Button("Logout");

        deposit.setOnAction(e -> app.showTransaction("deposit"));
        withdraw.setOnAction(e -> app.showTransaction("withdraw"));
        logout.setOnAction(e -> app.showLogin());

        getChildren().addAll(balance, deposit, withdraw, logout);
    }
}