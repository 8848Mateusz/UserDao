package pl.coderslab.entity;

public class User {
private int id;
private char userName;
private char email;
private char password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getUserName() {
        return userName;
    }

    public void setUserName(char userName) {
        this.userName = userName;
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public char getPassword() {
        return password;
    }

    public void setPassword(char password) {
        this.password = password;
    }
}
