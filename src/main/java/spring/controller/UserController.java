package spring.controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import spring.model.User;
import spring.service.GenericService;

@Controller
public class UserController {
	
	@Autowired
    private GenericService<User> userService;
	
	//call to index.jsp
	@GetMapping("/")
	public String showHomePage() {
	   // Get authenticated user name from SecurityContext
//	   SecurityContext context = SecurityContextHolder.getContext();
//	      
//	   model.addAttribute("message", "You are logged in as " 
//	                     + context.getAuthentication().getName());
		return "index";
	}
	
	@GetMapping("/new")
	public String newUser() {
		return "newUser";
	}
	
	@GetMapping("/showUser")
	public String showUser(Model model) {
		model.addAttribute("listUsers", userService.findAll());
		return "showUser";
	}
	
	@RequestMapping("/editUser/{id}")
	public String editUser(@PathVariable String id, Model model) {
		User user = userService.findById(id);
		model.addAttribute("user",user);
		return "editUser";
	}
	
	@RequestMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") @Valid User entity,
                            BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("listUsers", userService.findAll());
            return "newUser";
        }
        userService.save(entity);
        return "redirect:showUser";
    }
	
	@RequestMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable String id, Model model) {
		userService.delete(id);
		model.addAttribute("listUsers", userService.findAll());
		return "showUser";
	}
}
