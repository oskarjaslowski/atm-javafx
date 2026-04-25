package atm.model;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts = new HashMap<>();

    public Bank() {
        accounts.put("1111", new Account("1111", "1234", 1000));
        accounts.put("2222", new Account("2222", "4321", 500));
        accounts.put("9999", new Account("9999", "0000", 2500));
    }

    public Account login(String card, String pin) {
        Account acc = accounts.get(card);
        if (acc != null && acc.validatePin(pin)) {
            return acc;
        }
        return null;
    }
}