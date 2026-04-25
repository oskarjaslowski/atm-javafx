package atm.ui;

import atm.ATMApp;
import atm.model.Account;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class TransactionView extends VBox {

    public TransactionView(ATMApp app, Account acc, String type) {
        setSpacing(15);
        setAlignment(Pos.CENTER);

        Label title = new Label(type.toUpperCase());

        TextField amountField = new TextField();
        amountField.setPromptText("Enter amount");

        Button confirm = new Button("Confirm");
        Button back = new Button("Back");

        confirm.setOnAction(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());

                if (type.equals("deposit")) {
                    acc.deposit(amount);
                } else {
                    if (!acc.withdraw(amount)) {
                        new Alert(Alert.AlertType.ERROR, "Not enough money").show();
                        return;
                    }
                }

                app.showMenu(acc);

            } catch (Exception ex) {
                new Alert(Alert.AlertType.ERROR, "Invalid number").show();
            }
        });

        back.setOnAction(e -> app.showMenu(acc));

        getChildren().addAll(title, amountField, confirm, back);
    }
}