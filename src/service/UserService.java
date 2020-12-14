package service;

import java.util.List;
import model.User;

public interface UserService {

	List<User> getListUser();

	User findById(Long id);

	List<User> findAll();
}
