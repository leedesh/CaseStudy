package casestudy.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="userrecipe")
public class UserRecipe {

	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userrecipeid")
	@Id
	private int userRecipeId;

	@Column(name = "userrname", length = 50)
	private String userRName;

	@Column(name = "useringredients", length = 500)
	private String userIngredients;
	@Column(name = "usersteps", length = 2000)
	private String userSteps;
	@Column(name = "usermealtime", length = 50)
	private String userMealTime;
	

	@Column(name = "usermealtype", length = 50)
	private String userMealType;
	@Column(name = "usercuisine", length = 50)
	private String userCuisine;
	@Column(name = "userphoto")
	private String userPhoto;

	@ManyToOne
	@JoinColumn(name="userid")
	private Users user;

	public int getUserRecipeId() {
		return userRecipeId;
	}

	public void setUserRecipeId(int userRecipeId) {
		this.userRecipeId = userRecipeId;
	}

	public String getUserRName() {
		return userRName;
	}

	public void setUserRName(String userRName) {
		this.userRName = userRName;
	}

	public String getUserIngredients() {
		return userIngredients;
	}

	public void setUserIngredients(String userIngredients) {
		this.userIngredients = userIngredients;
	}

	public String getUserSteps() {
		return userSteps;
	}

	public void setUserSteps(String userSteps) {
		this.userSteps = userSteps;
	}

	public String getUserMealTime() {
		return userMealTime;
	}

	public void setUserMealTime(String userMealTime) {
		this.userMealTime = userMealTime;
	}

	public String getUserMealType() {
		return userMealType;
	}

	public void setUserMealType(String userMealType) {
		this.userMealType = userMealType;
	}

	public String getUserCuisine() {
		return userCuisine;
	}

	public void setUserCuisine(String userCuisine) {
		this.userCuisine = userCuisine;
	}

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + ((userCuisine == null) ? 0 : userCuisine.hashCode());
		result = prime * result + ((userIngredients == null) ? 0 : userIngredients.hashCode());
		result = prime * result + ((userMealTime == null) ? 0 : userMealTime.hashCode());
		result = prime * result + ((userMealType == null) ? 0 : userMealType.hashCode());
		result = prime * result + ((userPhoto == null) ? 0 : userPhoto.hashCode());
		result = prime * result + ((userRName == null) ? 0 : userRName.hashCode());
		result = prime * result + userRecipeId;
		result = prime * result + ((userSteps == null) ? 0 : userSteps.hashCode());
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
		UserRecipe other = (UserRecipe) obj;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (userCuisine == null) {
			if (other.userCuisine != null)
				return false;
		} else if (!userCuisine.equals(other.userCuisine))
			return false;
		if (userIngredients == null) {
			if (other.userIngredients != null)
				return false;
		} else if (!userIngredients.equals(other.userIngredients))
			return false;
		if (userMealTime == null) {
			if (other.userMealTime != null)
				return false;
		} else if (!userMealTime.equals(other.userMealTime))
			return false;
		if (userMealType == null) {
			if (other.userMealType != null)
				return false;
		} else if (!userMealType.equals(other.userMealType))
			return false;
		if (userPhoto == null) {
			if (other.userPhoto != null)
				return false;
		} else if (!userPhoto.equals(other.userPhoto))
			return false;
		if (userRName == null) {
			if (other.userRName != null)
				return false;
		} else if (!userRName.equals(other.userRName))
			return false;
		if (userRecipeId != other.userRecipeId)
			return false;
		if (userSteps == null) {
			if (other.userSteps != null)
				return false;
		} else if (!userSteps.equals(other.userSteps))
			return false;
		return true;
	}

	public UserRecipe(int userRecipeId, String userRName, String userIngredients, String userSteps, String userMealTime,
			String userMealType, String userCuisine, String userPhoto, Users user) {
		super();
		this.userRecipeId = userRecipeId;
		this.userRName = userRName;
		this.userIngredients = userIngredients;
		this.userSteps = userSteps;
		this.userMealTime = userMealTime;
		this.userMealType = userMealType;
		this.userCuisine = userCuisine;
		this.userPhoto = userPhoto;
		this.user = user;
	}
	
	public UserRecipe() {}
	
	
}
