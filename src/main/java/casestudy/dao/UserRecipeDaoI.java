package casestudy.dao;

import java.util.List;

import casestudy.models.UserRecipe;

public interface UserRecipeDaoI {

	public boolean addUserRecipe(UserRecipe userrec);
	public UserRecipe getUserRecipe(int userRecipeId);
	public boolean editUserRecipe(UserRecipe userrec);
	public boolean deleteUserRecipe(int userRecipeId);
	public List<UserRecipe>getAllUserRecipe();
	
	
	
}
