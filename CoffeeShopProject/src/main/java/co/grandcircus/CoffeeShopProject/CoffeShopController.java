package co.grandcircus.CoffeeShopProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeShopController {

//	@Autowired
//	private CoffeeDao coffeeShop;

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}

	@RequestMapping("/drinkslurm")
	public ModelAndView showdrinkslurm() {
		ModelAndView mav = new ModelAndView("drinkslurm");
		return mav;
	}

	@RequestMapping("/register")
	public ModelAndView listCoffee(@RequestParam(value = "category", required = false) String category) {

		System.out.println(category);

		ModelAndView mav = new ModelAndView("register");

//		if (category == null || category.isEmpty()) {
//			mav.addObject("menu", coffeeShop.getAllCoffee());
//		} else {
//			mav.addObject("menu", coffeeShop.getCoffeeInCategory(category));
//		}
		return mav;
	}

	@RequestMapping("/add-coffee")
	public ModelAndView showCoffeeForm() {
		return new ModelAndView("register");
	}

	@PostMapping("/add-register")

	public ModelAndView submitCoffeeForm(Coffee coffee) {

//		System.out.println(coffee);
//
//		coffeeShop.addCoffee(coffee);
		return new ModelAndView("redirect:/register");
	}

}