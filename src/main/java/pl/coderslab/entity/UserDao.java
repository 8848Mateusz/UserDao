package pl.coderslab.entity;

import java.sql.Connection;
import java.sql.SQLException;

public class UserDao {





    private static final String CREATE_USER_QUERY() {
        try (Connection connection = DbUtil.connect()) {
            System.out.println("Connection successful");


        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return null;
    }
}

