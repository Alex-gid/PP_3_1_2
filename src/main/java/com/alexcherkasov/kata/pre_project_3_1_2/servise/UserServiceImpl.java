package com.alexcherkasov.kata.pre_project_3_1_2.servise;

import com.alexcherkasov.kata.pre_project_3_1_2.dao.Dao;
import com.alexcherkasov.kata.pre_project_3_1_2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final Dao dao;

    @Autowired
    public UserServiceImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public User findByID(Long id) {
        return dao.getUser(id);
    }

    @Override
    public List<User> findAll() {
        return dao.getAllUsers();
    }

    @Override
    @Transactional(readOnly = true)
    public void saveUser(User user) {
        dao.saveUser(user);
    }

    @Override
    @Transactional(readOnly = true)
    public void updateUser(User user) {
        dao.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        dao.deleteUser(id);
    }
}
