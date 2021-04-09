package casestudy.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import casestudy.models.Recipe;

import casestudy.models.UserRecipe;
import casestudy.models.Users;
import casestudy.services.RecipeService;
import casestudy.services.UserRecipeService;
import casestudy.services.UserService;

@Controller
public class HomeController {

	RecipeService recipeService;
	UserService userService;

	UserRecipeService userrecService;

	@Autowired
	public HomeController(UserService userService, RecipeService recipeService, UserRecipeService userrecService) {

		this.userService = userService;
		this.recipeService = recipeService;
		this.userrecService = userrecService;

	}

	// User Login Stuff

	@GetMapping("/")
	public String showIndex() {
		System.out.println("hello line 34");
		return "login";
	}

	@GetMapping("/recipe")
	public String showRecipePage(Model model, HttpSession session) {
		Users user = (Users) session.getAttribute("currentUser");
		List<Recipe> recipes = recipeService.getAllRecipes();
		model.addAttribute("recipes", recipes);
		return "recipe";
	}

//	@PostMapping("/recipetest2")
//	public String processAddLike(@RequestParam("recipeid") int recipeid, HttpSession session){
//		
//		//Boolean liked, Users user, Recipe recipe, int rating
//		
//		Users user = (Users) session.getAttribute("currentUser");
//		Recipe recipe=  recipeService.getRecipeById(recipeid);
//		UserRating addRecipeLiked = new UserRating( true, user, recipe,null);
//		//if(recipe is already liked by user return ;
//		
//		
//		
//		return null;
//		
//	}

	@GetMapping("/register")
	public String showRegisterPage(Model model) {
		model.addAttribute("user", new Users());
		return "register";
	}

	@PostMapping("/register")
	public String registerNewUser(@Valid @ModelAttribute("user") Users user, BindingResult result) {
		if (result.hasErrors()) {
			return "register";
		}
		userService.saveUser(user);
		return "redirect:/login";
	}

	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String processLoginRequest(@RequestParam("email") String email, @RequestParam("password") String password,
			Model model, HttpSession session) {

		Users user = userService.findUserByEmail(email);

		if (user != null && password.equals(user.getPassword())) {
			session.setAttribute("currentUser", user);
			return "redirect:/recipe";
		}
		model.addAttribute("loginFailedMessage", "Login Invalid");
		return "login";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "logout";

	}

	@GetMapping("/addrecipe")
	public String showAddRecipePage(Model model) {
		model.addAttribute("userrecipe", new UserRecipe());
		return "addrecipe";
	}

	@PostMapping("/addrecipe")
	public String addUserRecipe(@ModelAttribute("userrecipe") UserRecipe userrec, Model model, BindingResult result,
			HttpSession session) {
		Users userlogin = (Users) session.getAttribute("currentUser");
		// Users userlogin= new Users(1, "johncena@gmail.com", "12345");
		userrec.setUser(userlogin);
		userrecService.addUserRecipe(userrec);
		System.out.println("recipe added");

		return ("redirect:/showuserrecipe");
	}

	@GetMapping("/showuserrecipe")
	public String getUserRecipes(Model model, HttpSession session) {

		Users user = (Users) session.getAttribute("currentUser");
		List<UserRecipe> recipes = userrecService.getAllUserRecipes();
		model.addAttribute("userrecipes", recipes);
		return "showuserrecipe";
	}

	@GetMapping("/updaterecipe")
	public String showUpdateRecipePage(Model model) {
		model.addAttribute("userrecipe", new UserRecipe());
		return "updaterecipe";
	}

	@PostMapping("/updaterecipe")
	public String showUpdateRecipePage(@ModelAttribute("userrecipe") UserRecipe userrec, Model model,
			BindingResult result, HttpSession session) {
		Users userlogin = (Users) session.getAttribute("currentuser");
		// Users userlogin= new Users(1, "johncena@gmail.com", "12345");
		userrec.setUser(userlogin);
		userrecService.updateUserRecipe(userrec);
		System.out.println("recipe updated");

		return ("redirect:/showuserrecipe");
	}

	@GetMapping("/deleterecipe")
	public String showDeleteRecipePage(Model model) {
		model.addAttribute("userrecipe", new UserRecipe());
		return "deleterecipe";
	}

	@PostMapping("/deleterecipe")
	public String showDeleteRecipePage(@ModelAttribute("userrecipe") UserRecipe userrec,
			@RequestParam("userRecipeId") int userRecipeId, Model model, BindingResult result, HttpSession session) {
		Users userlogin = (Users) session.getAttribute("currentuser");
		// Users userlogin= new Users(1, "johncena@gmail.com", "12345");
		userrec.setUser(userlogin);
		userrecService.removeUserRecipes(userRecipeId);
		System.out.println("recipe deleted");

		return ("redirect:/showuserrecipe");
	}

}
