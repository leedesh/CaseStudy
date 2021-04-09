package casestudy.dao;

import java.util.List;

import casestudy.config.DBConnection;
import casestudy.models.UserRecipe;

public class UserRecipeDao extends DBConnection implements UserRecipeDaoI {

		@Override
	public boolean addUserRecipe(UserRecipe userrec) {
		
		try {
			this.connect();
			em.getTransaction().begin();
			em.persist(userrec);
			em.getTransaction().commit();
			this.disconnect();
			return true;
		} catch( Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	

	@Override
	public UserRecipe getUserRecipe(int userRecipeId) {
		this.connect();
		UserRecipe userrecFound= em.find(UserRecipe.class, userRecipeId);
		this.disconnect();
		return userrecFound;
	}

	@Override
	public boolean editUserRecipe(UserRecipe userrec) {
		try {
			this.connect();
			em.getTransaction().begin();
			UserRecipe userrecFound=em.find(UserRecipe.class, userrec.getUserRecipeId());
			userrecFound.setUserRName((userrec.getUserRName()));
			userrecFound.setUserIngredients(userrec.getUserIngredients());
			userrecFound.setUserSteps((userrec.getUserSteps()));
			userrecFound.setUserMealTime(userrec.getUserMealTime());
			userrecFound.setUserMealType((userrec.getUserMealType()));
			userrecFound.setUserCuisine(userrec.getUserCuisine());
			userrecFound.setUserPhoto((userrec.getUserPhoto()));
			em.getTransaction().commit();
			this.disconnect();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteUserRecipe(int userRecipeId) {
		try {
			this.connect();
			em.getTransaction().begin();
			UserRecipe userrecFound = em.find(UserRecipe.class, userRecipeId);
			em.remove(userrecFound);
			em.getTransaction().commit();
			this.disconnect();
			return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<UserRecipe> getAllUserRecipe() {
		this.connect();
		List<UserRecipe> userrec = em.createQuery("select u from UserRecipe u ").getResultList();
		this.disconnect();
		
		return userrec;
	}
	
	
	
	
}
