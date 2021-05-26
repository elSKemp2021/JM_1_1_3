package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        UserDao us = new UserDaoJDBCImpl();

        us.createUsersTable(); // создание таблицы
        us.saveUser("'John'", "'Wisdom'", (byte) 35); //добавленеи юзеров
        us.saveUser("'Alice'", "'Brown'", (byte) 27);
        us.saveUser("'Robert'", "'Edison'", (byte) 25);
        us.saveUser("'Andy'", "'Hampsteen'", (byte) 32);
        us.removeUserById(3); // удаление по id
        System.out.println("----------------------------------------");
        System.out.println(us.getAllUsers());
        us.cleanUsersTable(); // очистка таблицы
        us.dropUsersTable(); // удаление таблицы
    }
}