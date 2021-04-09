package casestudy.repo;

import org.springframework.data.repository.CrudRepository;

import casestudy.models.Recipe;
import casestudy.models.Users;

public interface RecipeRepo extends CrudRepository<Recipe, Integer>{
	
	

}
