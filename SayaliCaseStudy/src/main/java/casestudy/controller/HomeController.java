package casestudy.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import casestudy.models.Recipe;
import casestudy.models.Users;
import casestudy.services.RecipeService;
import casestudy.services.UserService;


@Controller
public class HomeController {
	
	 RecipeService recipeService;
	 UserService userService;
	
	@Autowired
	public HomeController(UserService userService, RecipeService recipeService) {

		this.userService = userService;
		this.recipeService=recipeService;
		
	}
	
	//User Login Stuff
	
	
	

	@GetMapping("/")
	public String showIndex() {
		System.out.println("hello line 34");
		return "index";
	}
	
	@GetMapping("/recipetest")
	public String showRecipePage(Model model, HttpSession session) {
		Users user = (Users) session.getAttribute("currentUser");
		List<Recipe> recipes = recipeService.getAllRecipes();
		model.addAttribute("recipes", recipes);
		return "recipe";
	}
	
	
//	@GetMapping("/register")
//	public String showNewUserPage(Model model) {
//		model.addAttribute("user", new Users());
//		return "newuser";
//	}
//	
//	@PostMapping("/register")
//	public String registerNewUser(@Valid @ModelAttribute("user") Users user, 
//			BindingResult result) {
//		if (result.hasErrors()) {
//			return "registration";
//		}
//		userService.saveUser(user);
//		return "redirect:/login";
//	}
	
	
	
	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	
	
	@PostMapping("/login")
	public String processLoginRequest(@RequestParam("email") String email, 
			@RequestParam("password") String password, Model model, HttpSession session) {
		
		Users user = userService.findUserByEmail(email);
		
		if (user != null && password.equals(user.getPassword())) {
			session.setAttribute("currentUser", user);
			return "/welcome";
		}
		model.addAttribute("loginFailedMessage", "Login Invalid");
		return "login";
	}

	
//	@PostMapping("/")
//		public String processAddLike(@RequestParam("recipeId")int recipeId, HttpSession session) {
//		Users user = (Users) session.getAttribute("currentUser");
//		Recipe recipe= .getRecipeId(recipeId); 
//		
//		
//	}
//	
//	
	
	
	
	
	
	
	
		//User Saving Recipe Stuff
	
	
		@GetMapping("/recipelist")
		public String showRecipeListPage(Model model, HttpSession session) {
			Users user = (Users) session.getAttribute("currentUser");
			List<Recipe> recipes = recipeService.getAllRecipes();
			model.addAttribute("recipes", recipes);
			return "recipelist";
		}
			
	
	
	
	
}
