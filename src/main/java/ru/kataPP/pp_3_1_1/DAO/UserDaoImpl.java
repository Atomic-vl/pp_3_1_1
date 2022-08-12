package ru.kataPP.pp_3_1_1.DAO;

import ru.kataPP.pp_3_1_1.model.User;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void addUser(User user) {
        entityManager.persist(user);

    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        entityManager.remove(findUser(id));
    }

    @Override
    public User findUser(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public List<User> showAllUsers() {
        return entityManager.createQuery("SELECT u FROM User u").getResultList();
    }

}
