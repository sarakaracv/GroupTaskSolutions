package Week_12.reyhan;

import java.time.LocalDateTime;

public class Account {

    private int client_id;
    private int account_type;
    private String description;
    private int balance;
    private LocalDateTime creation_time;


    public Account(int client_id, int account_type, String description, int balance, LocalDateTime creation_time) {
        setClient_id(client_id);
        setAccount_type(account_type);
        setDescription(description);
        setBalance(balance);
        setCreation_time(creation_time);
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getAccount_type() {
        return account_type;
    }

    public void setAccount_type(int account_type) {
        this.account_type = account_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public LocalDateTime getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(LocalDateTime creation_time) {
        this.creation_time = creation_time;
    }
}
