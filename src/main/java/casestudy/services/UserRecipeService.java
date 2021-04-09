package casestudy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import casestudy.dao.UserRecipeDao;
import casestudy.models.UserRecipe;

@Service
public class UserRecipeService {

	
	private UserRecipeDao usreD= new UserRecipeDao();
	
//	@Autowired
	
//	public UserRecipeService(UserRecipeDao urseD) {
//		this.usreD= usreD;
//		
//	}
//	
	public void addUserRecipe(UserRecipe userrec) {
		usreD.addUserRecipe(userrec);
	}
	
	public UserRecipe getUserRecipe(int userRecipeId) {
		
		return usreD.getUserRecipe(userRecipeId);
	}


	public void updateUserRecipe(UserRecipe userrec) {
		
		usreD.editUserRecipe(userrec);
	}

	public List<UserRecipe>getAllUserRecipes(){
		return usreD.getAllUserRecipe();
		
	}

	public void removeUserRecipes(int userRecipeId) {
		
		usreD.deleteUserRecipe(userRecipeId);
	}


}
