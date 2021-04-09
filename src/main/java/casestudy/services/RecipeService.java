package casestudy.services;

import java.util.List;

import org.springframework.stereotype.Service;

import casestudy.config.DBConnection;
import casestudy.models.Recipe;

@Service
public class RecipeService extends DBConnection {


	public List<Recipe> getAllRecipes() {
	try {
		this.connect();
		
		List<Recipe> recipeFound = em.createQuery("select r from Recipe r").getResultList();
		this.disconnect();
		return  recipeFound;
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		 
	return null;
	}
	
	public boolean addRecipe(Recipe recipe) {
		
		try {
			this.connect();
			em.getTransaction().begin();		
			em.persist(recipe);
			em.getTransaction().commit();
			this.disconnect();
		return true;
		
	}catch (Exception e) {
		e.printStackTrace();
	}
		return false;
	}
	
	
	public Recipe getRecipeById(int recipeid) {
		
		try {
			this.connect();
			Recipe recipe = em.find(Recipe.class,recipeid);
			this.disconnect();
			return recipe;
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	
//	public boolean addLikedRecipe(Recipe recipe) {
//		try {
//			
//			
//		
//	} catch(Exception e) {
//		e.printStackTrace();
//	}

}