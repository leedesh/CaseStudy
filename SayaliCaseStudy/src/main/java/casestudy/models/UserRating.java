package casestudy.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="user_rating")
public class UserRating {
	
	@EmbeddedId
	UserRatingKey id;
	
	@ManyToOne
	@MapsId("useridentity")
	@JoinColumn(name="userid")
	
	Users user;
	
	
	@ManyToOne
	@MapsId("recipeidentity")
	@JoinColumn(name="recipeid")
	Recipe recipe;
	
	@Column
	private Boolean liked;
	
	
	int rating;
				
	
	
	public UserRating() {}
				
	public UserRating(Boolean liked, Users user, Recipe recipe, int rating) {
		super();
		this.liked = liked;
		this.user = user;
		this.recipe = recipe;
		this.rating = rating;
	}


	public UserRatingKey getId() {
		return id;
	}


	public void setId(UserRatingKey id) {
		this.id = id;
	}


	public Users getUser() {
		return user;
	}


	public Boolean getLiked() {
		return liked;
	}

	public void setLiked(Boolean liked) {
		this.liked = liked;
	}

	public void setUser(Users user) {
		this.user = user;
	}


	public Recipe getRecipe() {
		return recipe;
	}


	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((liked == null) ? 0 : liked.hashCode());
		result = prime * result + rating;
		result = prime * result + ((recipe == null) ? 0 : recipe.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		UserRating other = (UserRating) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (liked == null) {
			if (other.liked != null)
				return false;
		} else if (!liked.equals(other.liked))
			return false;
		if (rating != other.rating)
			return false;
		if (recipe == null) {
			if (other.recipe != null)
				return false;
		} else if (!recipe.equals(other.recipe))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}


	
	
	
	
	

	
	
	
}
	


