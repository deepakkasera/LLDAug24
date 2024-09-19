package org.example.designpatterns.singleton;

public class DBConnection {
    private static DBConnection instance = null;

    String url;
    String username;
    String password;

    private DBConnection() {

    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
}
