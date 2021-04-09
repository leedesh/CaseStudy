package casestudy.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import casestudy.models.Users;

@Repository 
public interface UserRepo extends CrudRepository<Users, Integer> {
	
	Users findUserByUserid(int userid);
	Users findUserByEmail(String email);
	
	
}
