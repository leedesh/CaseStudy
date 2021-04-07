package casestudy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import casestudy.models.*;
import casestudy.repo.*;



@Service
public class UserService {
	
	
	private UserRepo userRepository;
	
	@Autowired
	public UserService(UserRepo userRepository) {
		this.userRepository = userRepository;
	}

	public void saveUser(Users user) {
		userRepository.save(user);

	}
	
	public Users findUserByUserid(int userid) {
		
		return userRepository.findUserByUserid(userid);
	}

	public Users findUserByEmail(String email) {
	
		return userRepository.findUserByEmail(email);
	
	}
	
	
	
	 

}
