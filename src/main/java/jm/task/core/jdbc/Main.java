package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.PreparedStatement;

public class Main extends Util {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Илья", "Программистов", (byte) 31);
        userService.saveUser("Иван", "Охлобыстин", (byte) 32);
        userService.saveUser("Максим", "Кас", (byte) 33);
        userService.saveUser("Виктор", "Абросимов", (byte) 34);

        userService.removeUserById(3);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
