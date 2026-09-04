package me.chaitanyakelkar.firstspring;

public class BankResponse {
    private String message;

    public BankResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
