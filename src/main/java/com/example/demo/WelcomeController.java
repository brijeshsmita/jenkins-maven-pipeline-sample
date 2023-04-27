/**
 *
 */
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author smitkuma
 *
 */
@Controller
public class WelcomeController {


	@GetMapping("/")
    public ModelAndView showHomePage() {
		//System.out.println("show Home page");
		 return new ModelAndView("home");
    }
}
