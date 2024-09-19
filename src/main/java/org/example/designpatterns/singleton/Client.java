package org.example.designpatterns.singleton;

public class Client {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
        DBConnection dbConnection1 = DBConnection.getInstance();
        DBConnection dbConnection2 = DBConnection.getInstance();
        DBConnection dbConnection3 = DBConnection.getInstance();

        System.out.println("DEBUG");
    }
}
