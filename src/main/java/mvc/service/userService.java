package mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.dao.UserDao;
import mvc.model.User;

@Service
public class userService {
	@Autowired
	private UserDao userdao;
	
	public int createUser(User user) {
		return this.userdao.saveUser(user);
	}
}
