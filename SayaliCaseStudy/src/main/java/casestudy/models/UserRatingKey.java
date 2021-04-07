package casestudy.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserRatingKey implements Serializable {

	@Column(name = "userid")
	int useridentity;

	@Column(name = "recipeid")
	int recipeidentity;

	public UserRatingKey() {
	}

	public UserRatingKey(int useridentity, int recipeidentity) {
		super();
		this.useridentity = useridentity;
		this.recipeidentity = recipeidentity;
	}

	public int getUseridentity() {
		return useridentity;
	}

	public void setUseridentity(int useridentity) {
		this.useridentity = useridentity;
	}

	public int getRecipeidentity() {
		return recipeidentity;
	}

	public void setRecipeidentity(int recipeidentity) {
		this.recipeidentity = recipeidentity;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + recipeidentity;
		result = prime * result + useridentity;
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
		UserRatingKey other = (UserRatingKey) obj;
		if (recipeidentity != other.recipeidentity)
			return false;
		if (useridentity != other.useridentity)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserRatingKey [useridentity=" + useridentity + ", recipeidentity=" + recipeidentity + "]";
	}

	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
}
