package ru.kataPP.pp_3_1_1.DAO;

import ru.kataPP.pp_3_1_1.model.User;


import java.util.List;

public interface UserDao {

    public void addUser(User user);

    public void deleteUser(int id);

    public User findUser(int id);

    public void updateUser(User user);

    public List<User> showAllUsers();

}
