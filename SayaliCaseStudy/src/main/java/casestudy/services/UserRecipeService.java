package casestudy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import casestudy.dao.UserRecipeDao;
import casestudy.models.UserRecipe;

public class UserRecipeService {

	
	private UserRecipeDao usreD= new UserRecipeDao();
	
	@Autowired
	
	public UserRecipeService(UserRecipeDao urseD) {
		this.usreD= usreD;
		
	}
	
	public void addUserRecipeService(UserRecipe userrec) {
		usreD.addUserRecipe(userrec);
	}
	
	public UserRecipe getUserRecipeService(int userRecipeId) {
		
		return usreD.getUserRecipe(userRecipeId);
	}


	public void updateUserRecipeService(UserRecipe userrec) {
		
		usreD.editUserRecipe(userrec);
	}

	public List<UserRecipe>getAllUserRecipes(){
		return usreD.getAllUserRecipe();
		
	}

	public void removeUserRecipes(int userRecipeId) {
		
		usreD.deleteUserRecipe(userRecipeId);
	}


}
