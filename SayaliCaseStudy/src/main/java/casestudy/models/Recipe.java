package casestudy.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "recipe")
public class Recipe {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "recipeid")
	@Id
	private int recipeId;

	@Column(name = "rname", length = 50)
	private String rName;

	@Column(name = "ingredients", length = 500)
	private String ingredients;
	@Column(name = "steps", length = 2000)
	private String steps;
	@Column(name = "mealtime", length = 50)
	private String mealTime;
	

	@Column(name = "mealtype", length = 50)
	private String mealType;
	@Column(name = "cuisine", length = 50)
	private String cuisine;
	@Column(name = "photo")
	private String photo;

//	 @ManyToMany(targetEntity=Users.class)
//	 private List<Users> users;
	
	@OneToMany(mappedBy="recipe")
	List<UserRating> ratings;

	public int getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getSteps() {
		return steps;
	}

	public Recipe(int recipeId, String rName, String ingredients, String steps, String mealTime, String mealType,
			String cuisine, String photo) {
		super();
		this.recipeId = recipeId;
		this.rName = rName;
		this.ingredients = ingredients;
		this.steps = steps;
		this.mealTime = mealTime;
		this.mealType = mealType;
		this.cuisine = cuisine;
		this.photo=photo;
	}

	public void setSteps(String steps) {
		this.steps = steps;
	}

	public String getMealTime() {
		return mealTime;
	}

	public void setMealTime(String time) {
		this.mealTime = time;
	}

	public String getMealType() {
		return mealType;
	}

	public void setMealType(String mealType) {
		this.mealType = mealType;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Recipe() {
		// users= new ArrayList<Users>();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cuisine == null) ? 0 : cuisine.hashCode());
		result = prime * result + ((ingredients == null) ? 0 : ingredients.hashCode());
		result = prime * result + ((mealTime == null) ? 0 : mealTime.hashCode());
		result = prime * result + ((mealType == null) ? 0 : mealType.hashCode());
		result = prime * result + ((photo == null) ? 0 : photo.hashCode());
		result = prime * result + ((rName == null) ? 0 : rName.hashCode());
		result = prime * result + ((ratings == null) ? 0 : ratings.hashCode());
		result = prime * result + recipeId;
		result = prime * result + ((steps == null) ? 0 : steps.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recipe other = (Recipe) obj;
		if (cuisine == null) {
			if (other.cuisine != null)
				return false;
		} else if (!cuisine.equals(other.cuisine))
			return false;
		if (ingredients == null) {
			if (other.ingredients != null)
				return false;
		} else if (!ingredients.equals(other.ingredients))
			return false;
		if (mealTime == null) {
			if (other.mealTime != null)
				return false;
		} else if (!mealTime.equals(other.mealTime))
			return false;
		if (mealType == null) {
			if (other.mealType != null)
				return false;
		} else if (!mealType.equals(other.mealType))
			return false;
		if (photo == null) {
			if (other.photo != null)
				return false;
		} else if (!photo.equals(other.photo))
			return false;
		if (rName == null) {
			if (other.rName != null)
				return false;
		} else if (!rName.equals(other.rName))
			return false;
		if (ratings == null) {
			if (other.ratings != null)
				return false;
		} else if (!ratings.equals(other.ratings))
			return false;
		if (recipeId != other.recipeId)
			return false;
		if (steps == null) {
			if (other.steps != null)
				return false;
		} else if (!steps.equals(other.steps))
			return false;
		return true;
	}

}
