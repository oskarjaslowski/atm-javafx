package atm.ui;

import atm.ATMApp;
import atm.model.*;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class LoginView extends VBox {

    public LoginView(ATMApp app, Bank bank) {
        setSpacing(15);
        setAlignment(Pos.CENTER);

        Label title = new Label("ATM LOGIN");

        TextField cardField = new TextField();
        cardField.setPromptText("Card Number");

        PasswordField pinField = new PasswordField();
        pinField.setPromptText("PIN");

        Button loginBtn = new Button("Login");

        loginBtn.setOnAction(e -> {
            Account acc = bank.login(cardField.getText(), pinField.getText());
            if (acc != null) {
                app.showMenu(acc);
            } else {
                new Alert(Alert.AlertType.ERROR, "Wrong data").show();
            }
        });

        getChildren().addAll(title, cardField, pinField, loginBtn);
    }
}