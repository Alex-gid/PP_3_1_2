package com.alexcherkasov.kata.pre_project_3_1_2.dao;
import com.alexcherkasov.kata.pre_project_3_1_2.model.User;

import java.util.List;

public interface Dao {

    List<User> getAllUsers();
    User getUser(Long id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);



}
