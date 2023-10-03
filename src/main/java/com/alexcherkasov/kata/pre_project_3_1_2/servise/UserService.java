package com.alexcherkasov.kata.pre_project_3_1_2.servise;

import com.alexcherkasov.kata.pre_project_3_1_2.model.User;

import java.util.List;

public interface UserService {

    User findByID(Long id);

    List<User> findAll();

    void saveUser(User user);

    void updateUser(User user);

    void deleteById(Long id);

}
